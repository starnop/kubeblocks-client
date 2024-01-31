#!/bin/bash

while getopts "v:" opt; do
	case $opt in
		v)
			api_version=$OPTARG
			;;
		\?)
			echo "usage: ./generate.sh -v <api version>" >&2
			exit 1
			;;
	esac
done

if [ -z "${api_version}" ]; then
	echo "usage: ./generate.sh -v <api version>" >&2
	exit 1
fi

dir=$(pwd)
api_dir=${dir}/../apis
api_groups=("apps" "dataprotection" "extensions" "storage" "workloads")

for api_group in "${api_groups[@]}"; do
	crds_path=${api_dir}/${api_group}/${api_version}
	echo "handle all crds in path: ${crds_path}"
	crds=()
	while IFS= read -r -d '' file; do
	    crds+=("$file")
	done < <(find "${crds_path}" -type f -print0)
	for crd in "${crds[@]}"; do
		echo "handle crd: ${crd}"
		docker run \
			--rm \
			-v "${crd}":"${crd}" \
			-v /var/run/docker.sock:/var/run/docker.sock \
			-v "$(pwd)":"$(pwd)" \
			-ti \
			--network host \
			ghcr.io/kubernetes-client/java/crd-model-gen:v1.0.6 \
			/generate.sh \
			-u "${crd}" \
			-n io.kubeblocks."${api_group}" \
			-p io.kubeblocks."${api_group}" \
			-o "$(pwd)"
	done
done
