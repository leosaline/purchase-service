FROM openjdk:8-jre-alpine
VOLUME /tmp
ADD /target/*.jar /
ENTRYPOINT ["java","-jar","/app.jar"]
