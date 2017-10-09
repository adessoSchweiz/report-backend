#!/bin/sh
mvn clean package
docker build -t adesso/report-backend .
docker rm -f report-backend || true
docker run -d \
    -p 9080:8080 \
    -p 9848:4848 \
    --name report-backend \
    adesso/report-backend
docker logs -f report-backend