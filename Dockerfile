
FROM amazoncorretto:8-alpine-jdk

copy target/manidelasprin-0.0.1-SNAPSHOT.jar app.jar

entrypoint ["java","-jar","/app.jar"]
