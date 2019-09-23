FROM openjdk:8-jdk-alpine
VOLUME my-new-vol:/tmp
VOLUME my-new-vol:/logs/dockerSpringBoot
#ARG JAR_FILE
COPY target/app.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]