#!/bin/sh
echo "***** BUILD START *****"
mvn clean install
echo "-----------------------"
echo "**** TOMCAT START *****"
java -jar target/ElsoSpring-0.0.1-SNAPSHOT.jar
