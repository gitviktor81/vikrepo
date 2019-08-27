#!/bin/sh
echo "***** BUILD START *****"
mvn clean install
echo "-----------------------"
echo "**** TOMCAT START *****"
java -Dserver.port=3333 -jar target/ElsoSpring-0.0.1-SNAPSHOT.jar
