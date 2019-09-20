FROM openjdk:8-jdk-alpine
VOLUME /tmp
VOLUME /logs/dockerSpringBoot
#ARG JAR_FILE
COPY target/app.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]