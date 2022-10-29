FROM openjdk:18.0.2.1 as builder

WORKDIR /app

COPY config-server-1.0.jar .

ENTRYPOINT java -jar ./config-server-1.0.jar