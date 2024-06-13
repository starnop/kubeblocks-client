#!/bin/bash

api_version=""

while getopts "v:" opt; do
	case $opt in
		v)
			api_version=$OPTARG
			;;
		\?)
			echo "usage: ./get_crds.sh -v <api version>" >&2
			exit 1
			;;
	esac
done

if [ -z "${api_version}" ]; then
	echo "usage: ./get_crds.sh -v <api version>" >&2
	exit 1
fi

crd_list=(
	"backuppolicytemplates;apps;backuppolicytemplate"
	"clusterdefinitions;apps;clusterdefinition"
	"clusters;apps;cluster"
	"clusterversions;apps;clusterversion"
	"componentclassdefinitions;apps;componentclassdefinition"
	"componentdefinitions;apps;componentdefinition"
	"componentresourceconstraints;apps;componentresourceconstraint"
	"components;apps;component"
	"configconstraints;apps;configconstraint"
	"configurations;apps;configuration"
	"opsdefinitions;apps;opsdefinition"
	"opsrequests;apps;opsrequest"
	"servicedescriptors;apps;servicedescriptor"
	"actionsets;dataprotection;actionset"
	"backuppolicies;dataprotection;backuppolicy"
	"backuprepos;dataprotection;backuprepo"
	"backups;dataprotection;backup"
	"backupschedules;dataprotection;backupschedule"
	"restores;dataprotection;restore"
	"storageproviders;storage;storageprovider"
	"addons;extensions;addon"
	"instancesets;workloads;instancesets"
#	"replicatedstatemachines;workloads;replicatedstatemachine"
)

for crd_arr in "${crd_list[@]}"; do
	IFS=';' read -r -a crd <<< "${crd_arr}"
	echo "get crd ${crd[2]}"
	target_file="apis/${crd[1]}/${api_version}/${crd[2]}.yaml"
	kubectl get crd ${crd[0]}.${crd[1]}.kubeblocks.io -o yaml > ${target_file}
	echo "remove x-kubernetes-validations fields"
	yq 'del(.. | select(has("x-kubernetes-validations")).x-kubernetes-validations)' -i ${target_file}
done
