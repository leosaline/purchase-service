FROM openjdk:20-jdk-slim
VOLUME /tmp
ADD /target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]