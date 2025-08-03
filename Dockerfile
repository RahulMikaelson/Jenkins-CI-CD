# Stage 1: Build the application
FROM maven:3.9.11-amazoncorretto-21-alpine AS builder
WORKDIR /app
COPY pom.xml ./pom.xml
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Create the final, production-ready image
FROM openjdk:21-slim
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]