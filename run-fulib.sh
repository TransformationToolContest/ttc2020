#!/bin/bash

cd solutions/fulib
sudo docker build -t fulib/ttc2020:latest .
sudo docker run --rm fulib/ttc2020:latest > results-fulib.csv
