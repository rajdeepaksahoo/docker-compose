FROM openjdk:17
ADD target/Docker-Compose-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]