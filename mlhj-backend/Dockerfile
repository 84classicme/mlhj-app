FROM openjdk:11
ARG JAR_FILE=target/mlhj-backend.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]