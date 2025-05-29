# Use build argument to select base image, default to Eclipse Temurin Java 17 JDK
ARG BASE_IMAGE=eclipse-temurin:17-jdk
FROM ${BASE_IMAGE}

# Set working directory inside the container
WORKDIR /app

# Copy the Spring Boot fat jar into the container
COPY target/*.jar app.jar

# Expose the port your app listens on (default Spring Boot port 8080)
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
