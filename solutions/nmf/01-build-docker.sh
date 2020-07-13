#!/bin/bash

cd "$(dirname "$(readlink -f "$0")")"
sudo docker build -t nmf/ttc2020:latest .
