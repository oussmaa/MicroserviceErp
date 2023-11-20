FROM eclipse-temurin:18-jdk-alpine
WORKDIR /app
COPY target/ERPSerice1-0.0.1-SNAPSHOT.jar ERPSerice1-0.0.1-SNAPSHOT.jar
EXPOSE 8088
CMD ["java","-jar","ERPSerice1-0.0.1-SNAPSHOT.jar"]