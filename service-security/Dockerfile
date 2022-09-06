FROM openjdk:18.0.2.1 as builder

WORKDIR /app

COPY ./build/libs/service-security-1.0.jar .

ENTRYPOINT java -jar ./service-security-1.0.jar