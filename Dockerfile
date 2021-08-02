FROM openjdk:8-jdk-alpine
MAINTAINER Lobato <whoamibr@outlook.com>
EXPOSE 8080
ENV JAR_FILE=reports-build/target/reports-application.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT java -jar app.jar
