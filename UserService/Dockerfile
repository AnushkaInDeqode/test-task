FROM adoptopenjdk/openjdk11:alpine-jre
MAINTAINER Anushka
EXPOSE 8080
#RUN mvn package

COPY /target/UserService-0.0.1-SNAPSHOT.jar userAccountService.jar

ENTRYPOINT ["java", "-jar", "userAccountService.jar"]