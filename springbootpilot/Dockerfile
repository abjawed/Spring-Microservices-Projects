# Use an image with the SDK for compilation
FROM openjdk:17

WORKDIR /app

# Copy compiled artifacts from previous image
COPY ./target/springbootpilot-1.0.jar /app

#EXPOSE 9020

#This command specifies the default command to run when the container starts. It launches the Spring Boot application by executing the java -jar command with the Spring Boot JAR file as its argument like below.

CMD ["java", "-jar", "springbootpilot-1.0.jar"]