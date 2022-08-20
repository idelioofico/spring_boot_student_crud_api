FROM openjdk:11-jdk-oracle
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","./app.jar"]