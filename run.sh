#!/bin/bash

docker-compose down
docker-compose build
docker-compose up -d

sleep 4

# for some reason needs to restart app to connect to database
docker stop spring-boot-docker-tomcat_myapp-main_1
sleep 4
docker start spring-boot-docker-tomcat_myapp-main_1

