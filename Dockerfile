# Use OpenJDK base image
FROM openjdk:17

# Set working directory
WORKDIR /app

# Copy compiled JAR file from target folder
COPY target/scientific-calculator.jar scientific-calculator.jar

# Command to run the application
CMD ["java", "-jar", "scientific-calculator.jar"]
