# Use build argument to select base image, default to eclipse-temurin
ARG BASE_IMAGE=eclipse-temurin:17-jdk
FROM ${BASE_IMAGE}

# Optional: define a working directory
WORKDIR /app

# Copy JAR file into the container
COPY target/*.jar app.jar

# Expose port if needed (commonly 8080 for Spring Boot)
EXPOSE 8080

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
