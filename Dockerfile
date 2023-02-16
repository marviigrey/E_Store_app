FROM maven:3.6.0-jdk-8-slim
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:8-jdk-alpine

WORKDIR /app
COPY /home/app/target/new-baxi-service.jar .
ENTRYPOINT ["java", "new-baxi-service.jar"]

