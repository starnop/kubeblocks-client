package io.kubeblocks.sample;

import com.google.gson.Gson;
import io.kubeblocks.apps.Types;
import io.kubeblocks.apps.models.V1alpha1Cluster;
import io.kubeblocks.apps.models.V1alpha1ClusterSpec;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInner;
import io.kubeblocks.apps.models.V1alpha1ClusterSpecComponentSpecsInnerInstancesInner;
import io.kubeblocks.client.CustomObjectsApi;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.JSON;
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

        CustomObjectsApi customObjectsApi = new CustomObjectsApi(client, 0);

        String namespace = "default";
        V1alpha1Cluster cluster = new V1alpha1Cluster();
        cluster.setApiVersion("apps.kubeblocks.io/v1alpha1");
        cluster.setKind("Cluster");
        V1ObjectMeta metadata = new V1ObjectMeta();
        metadata.setName("hello-java-sdk");
        metadata.setNamespace(namespace);
        cluster.setMetadata(metadata);
        V1alpha1ClusterSpec spec = new V1alpha1ClusterSpec();
        spec.setClusterDefinitionRef("redis");
        spec.setClusterVersionRef("redis-7.0.6");
        List componentSpecs = new ArrayList<>();
        V1alpha1ClusterSpecComponentSpecsInner redisComponentSpec = new V1alpha1ClusterSpecComponentSpecsInner();
        redisComponentSpec.setComponentDefRef("redis");
        redisComponentSpec.setName("redis");
        redisComponentSpec.setReplicas(1);
        V1alpha1ClusterSpecComponentSpecsInner proxyComponentSpec = new V1alpha1ClusterSpecComponentSpecsInner();
        proxyComponentSpec.setComponentDefRef("redis-twemproxy");
        proxyComponentSpec.setName("redis-twemproxy");
        proxyComponentSpec.setReplicas(1);
        List<V1alpha1ClusterSpecComponentSpecsInnerInstancesInner> instances = new ArrayList<>();
        V1alpha1ClusterSpecComponentSpecsInnerInstancesInner instance = new V1alpha1ClusterSpecComponentSpecsInnerInstancesInner();
        instance.setName("proxy-0");
        instances.add(instance);
        proxyComponentSpec.setInstances(instances);
        V1alpha1ClusterSpecComponentSpecsInner sentinelComponentSpec = new V1alpha1ClusterSpecComponentSpecsInner();
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

        // create
        try {
            object = customObjectsApi.createNamespacedCustomObject(Types.Group, Types.VersionV1Alpha1, namespace, Types.Plural, cluster, "true", null, null);
            System.out.println(object);
        } catch (ApiException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        // get
        try {
            object = customObjectsApi.getNamespacedCustomObject(Types.Group, Types.VersionV1Alpha1, namespace, Types.Plural, cluster.getMetadata().getName());
            System.out.println(object);
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }

        // update
        cluster = convertToV1alpha1Cluster(object);
        V1alpha1ClusterSpecComponentSpecsInner proxySpec = null;
        for (V1alpha1ClusterSpecComponentSpecsInner compSpec :
                cluster.getSpec().getComponentSpecs()) {
            if ("redis-twemproxy".equals(compSpec.getName())) {
                proxySpec = compSpec;
                break;
            }
        }
        instances = proxySpec.getInstances();
        instance = new V1alpha1ClusterSpecComponentSpecsInnerInstancesInner();
        instance.setName("proxy-1");
        instances.add(instance);
        proxySpec.setInstances(instances);
        try {
            object = customObjectsApi.replaceNamespacedCustomObject(Types.Group, Types.VersionV1Alpha1, namespace, Types.Plural, cluster.getMetadata().getName(), cluster, null, null);
            System.out.println(object);
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }

        // delete
        try {
            object = customObjectsApi.deleteNamespacedCustomObject(Types.Group, Types.VersionV1Alpha1, namespace, Types.Plural, cluster.getMetadata().getName(), 0, false, null, null, null);
            System.out.println(object);
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }
    }

    private static V1alpha1Cluster convertToV1alpha1Cluster(Object object) {
        Gson gson = new JSON().getGson();
        String objectStr = gson.toJson(object);
        return gson.fromJson(objectStr, V1alpha1Cluster.class);
    }
}
