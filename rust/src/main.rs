use std::time::Duration;

use kube::{
    api::{Api, DeleteParams, PostParams},
    Client, CustomResource, ResourceExt,
};

use schemars::JsonSchema;
use serde::{Deserialize, Serialize};

use tokio::time::sleep;
use tracing::*;

#[derive(CustomResource, Deserialize, Serialize, Clone, Debug, Default, JsonSchema)]
#[kube(
    group = "apps.kubeblocks.io",
    version = "v1alpha1",
    kind = "Cluster",
    namespaced
)]
#[serde(rename_all = "camelCase")]
pub struct ClusterSpec {
    cluster_definition_ref: String,
    cluster_version_ref: String,
    component_specs: Vec<ComponentSpec>,
    termination_policy: String,
}

#[derive(Deserialize, Serialize, Clone, Debug, Default, JsonSchema)]
#[serde(rename_all = "camelCase")]
pub struct ComponentSpec {
    component_def_ref: String,
    name: String,
    replicas: i32,
}

fn new_redis_cluster(name: &str) -> Cluster {
    Cluster::new(
        name,
        ClusterSpec {
            cluster_definition_ref: "redis".to_owned(),
            cluster_version_ref: "redis-7.0.6".to_owned(),
            component_specs: vec![
                ComponentSpec {
                    component_def_ref: "redis".to_owned(),
                    name: "redis".to_owned(),
                    replicas: 1,
                },
                ComponentSpec {
                    component_def_ref: "redis-twemproxy".to_owned(),
                    name: "redis-twemproxy".to_owned(),
                    replicas: 1,
                },
                ComponentSpec {
                    component_def_ref: "redis-sentinel".to_owned(),
                    name: "redis-sentinel".to_owned(),
                    replicas: 3,
                },
            ],
            termination_policy: "WipeOut".to_owned(),
        },
    )
}

#[tokio::main]
async fn main() -> anyhow::Result<()> {
    tracing_subscriber::fmt::init();

    let client = Client::try_default().await?;
    let name = "hello-rust-sdk";

    let cluster = new_redis_cluster(name);
    info!("{:#}", serde_yaml::to_string(&cluster).unwrap());

    create(&client, &cluster).await?;
    // delete(&client, name).await?;

    Ok(())
}

pub async fn create(client: &Client, cluster: &Cluster) -> anyhow::Result<()> {
    let api: Api<Cluster> = Api::default_namespaced(client.clone());
    let params = PostParams::default();

    let cluster = api.create(&params, &cluster).await?;
    info!("Created: {:?}", cluster.name_any());

    // Wait for the api to catch up
    sleep(Duration::from_secs(2)).await;

    Ok(())
}

pub async fn delete(client: &Client, name: &str) -> anyhow::Result<()> {
    let api: Api<Cluster> = Api::default_namespaced(client.clone());

    api.delete(name, &DeleteParams::default())
        .await
        .unwrap()
        .map_left(|o| info!("Deleting: {:?}", o.name_any()))
        .map_right(|s| info!("Deleted: {:?}", s));

    // Wait for the api to catch up
    sleep(Duration::from_secs(2)).await;

    Ok(())
}
