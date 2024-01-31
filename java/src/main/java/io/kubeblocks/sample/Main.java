package io.kubeblocks.sample;

import io.kubeblocks.apps.models.V1alpha1Cluster;
import io.kubeblocks.apps.models.V1alpha1ClusterSpec;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecs;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CustomObjectsApi;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.ModelMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ModelMapper.addModelMap("apps.kubeblocks.io/v1alpha1", "Cluster", V1alpha1Cluster.class);

        ApiClient client = null;
        try {
            client = Config.defaultClient();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        Configuration.setDefaultApiClient(client);

        CustomObjectsApi customObjectsApi = new CustomObjectsApi(client);

        V1alpha1Cluster cluster = new V1alpha1Cluster();
        cluster.setApiVersion("apps.kubeblocks.io/v1alpha1");
        cluster.setKind("Cluster");
        V1ObjectMeta metadata = new V1ObjectMeta();
        metadata.setName("hello-java-sdk");
        metadata.setNamespace("default");
        cluster.setMetadata(metadata);
        V1alpha1ClusterSpec spec = new V1alpha1ClusterSpec();
        spec.setClusterDefinitionRef("redis");
        spec.setClusterVersionRef("redis-7.0.6");
        List componentSpecs = new ArrayList<>();
        V1alpha1ClusterSpecComponentSpecs redisComponentSpec = new V1alpha1ClusterSpecComponentSpecs();
        redisComponentSpec.setComponentDefRef("redis");
        redisComponentSpec.setName("redis");
        redisComponentSpec.setReplicas(1);
        V1alpha1ClusterSpecComponentSpecs proxyComponentSpec = new V1alpha1ClusterSpecComponentSpecs();
        proxyComponentSpec.setComponentDefRef("redis-twemproxy");
        proxyComponentSpec.setName("redis-twemproxy");
        proxyComponentSpec.setReplicas(1);
        V1alpha1ClusterSpecComponentSpecs sentinelComponentSpec = new V1alpha1ClusterSpecComponentSpecs();
        sentinelComponentSpec.setComponentDefRef("redis-sentinel");
        sentinelComponentSpec.setName("redis-sentinel");
        sentinelComponentSpec.setReplicas(3);
        componentSpecs.add(redisComponentSpec);
        componentSpecs.add(proxyComponentSpec);
        componentSpecs.add(sentinelComponentSpec);
        spec.setComponentSpecs(componentSpecs);
        spec.setTerminationPolicy(V1alpha1ClusterSpec.TerminationPolicyEnum.WIPEOUT);
        cluster.setSpec(spec);
        System.out.println(cluster);
        Object object = null;
        try {
            object = customObjectsApi.createNamespacedCustomObject("apps.kubeblocks.io", "v1alpha1", "default", "clusters", cluster, "true", null, null);
        } catch (ApiException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        System.out.println(object);
    }
}
