#!/bin/bash
if [ -z "$1" ]
then
    echo "Pass a topic name!"
else
    docker exec broker kafka-topics --bootstrap-server broker:9092 --create --topic $1
fi