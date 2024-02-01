from kubernetes import config, client
from kubernetes.dynamic import DynamicClient

# load the kubeconfig file from the default location
config.load_kube_config()

# create a dynamic client
dyn_client = DynamicClient(client.ApiClient())

# create a KubeBlocks Cluster
# define the Cluster object
cluster = {
    'apiVersion': 'apps.kubeblocks.io/v1alpha1',
    'kind': 'Cluster',
    'metadata': {
        'name': 'hello-python-sdk',
        'namespace': 'default'
    },
    'spec': {
        'clusterDefinitionRef': 'redis',
        'clusterVersionRef': 'redis-7.0.6',
        'componentSpecs': [
            {
                'componentDefRef': 'redis',
                'name': 'redis',
                'replicas': 1
            },
            {
                'componentDefRef': 'redis-twemproxy',
                'name': 'redis-twemproxy',
                'replicas': 1
            },
            {
                'componentDefRef': 'redis-sentinel',
                'name': 'redis-sentinel',
                'replicas': 3
            }
        ],
        'terminationPolicy': 'WipeOut',
    }
}

# Create the Cluster using the dynamic client
cluster_resource = dyn_client.resources.get(api_version='apps.kubeblocks.io/v1alpha1', kind='Cluster')
created_resource = cluster_resource.create(body=cluster, namespace='default')

# Delete the Cluster resource
# uncomment the following two lines to delete the Cluster
# cluster_resource = dyn_client.resources.get(api_version='apps.kubeblocks.io/v1alpha1', kind='Cluster')
# cluster_resource.delete(name='hello-python-sdk', namespace='default')
