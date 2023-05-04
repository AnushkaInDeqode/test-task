FROM maven
MAINTAINER Anushka
EXPOSE 8081
#RUN mvn package

COPY /target/UserService-0.0.1-SNAPSHOT.jar userAccountService.jar

ENTRYPOINT ["java", "-jar", "userAccountService.jar"]