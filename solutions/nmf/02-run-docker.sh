#!/bin/bash

SCRIPT_DIR="$(dirname "$(readlink -f "$0")")"

sudo docker run --rm -it \
	--mount "type=bind,source=$SCRIPT_DIR/../../de.hub.mse.ttc2020.benchmark/data,target=/data" \
       	nmf/ttc2020:latest
