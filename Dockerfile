# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Add the application's jar to the container
COPY target/library-0.0.1-SNAPSHOT.jar library-0.0.1-SNAPSHOT.jar

# Expose the port that the application runs on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "library-0.0.1-SNAPSHOT.jar"]
