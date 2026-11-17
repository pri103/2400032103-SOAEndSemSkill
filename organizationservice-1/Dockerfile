# Use official Eclipse Temurin OpenJDK 21 image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory inside the container
WORKDIR /app

# Copy the executable JAR from target directory
COPY target/organizationservice-1-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8081
EXPOSE 8081

# Command to execute the application
ENTRYPOINT ["java", "-jar", "app.jar"]

