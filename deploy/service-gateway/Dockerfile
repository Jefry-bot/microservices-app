FROM openjdk:18.0.2.1 as builder

WORKDIR /app

COPY service-gateway-1.0.jar .

ENTRYPOINT java -jar ./service-gateway-1.0.jar