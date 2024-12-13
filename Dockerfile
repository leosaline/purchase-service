FROM openjdk:20-jdk-slim
VOLUME /tmp
COPY /target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]