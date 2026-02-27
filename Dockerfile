# Stage 1: Build
FROM maven:latest AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn package
# RUN mvn -q -e -DskipTests package

## Stage 2: Run the main class from the built JAR
#FROM eclipse-temurin:21-jre
#WORKDIR /app
#COPY --from=build /app/target/*.jar app.jar
#EXPOSE 8080
CMD ["java", "-jar", "app.jar"]

