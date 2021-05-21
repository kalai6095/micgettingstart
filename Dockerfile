#Stage 1 - Build the jar file using gradle
FROM gradle:jdk11 as builder
COPY  . /app
WORKDIR /app
RUN gradle build -x test

#Stage 2 - Run the jar that was built in Stage 1
FROM openjdk:11-alpine
EXPOSE 4400
WORKDIR /app
COPY --from=builder /app/build/libs/micgettingstart-0.1-all.jar  /app
ENTRYPOINT java -Dmicronaut.environments=prod -jar micgettingstart-0.1-all.jar
