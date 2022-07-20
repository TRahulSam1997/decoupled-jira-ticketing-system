#!/bin/bash
docker exec -it broker /bin/kafka-topics --list --bootstrap-server broker:9092 