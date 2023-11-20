FROM eclipse-temurin:18-jdk-alpine
WORKDIR /app
COPY target/ERPSerice1.jar ERPSerice1.jar
EXPOSE 8088
CMD ["java","-jar","ERPSerice1.jar"]