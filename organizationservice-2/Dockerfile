# Use official Eclipse Temurin OpenJDK 21 image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory inside the container
WORKDIR /app

# Copy the executable JAR from target directory
COPY target/organizationservice-2-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8082
EXPOSE 8082

# Command to execute the application
ENTRYPOINT ["java", "-jar", "app.jar"]

