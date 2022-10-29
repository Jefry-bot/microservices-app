FROM openjdk:18.0.2.1 as builder

WORKDIR /app

COPY service-registry-1.0.jar .

ENTRYPOINT java -jar ./service-registry-1.0.jar