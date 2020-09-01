FROM openjdk:8-jre-alpine
WORKDIR /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]