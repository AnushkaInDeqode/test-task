FROM maven
MAINTAINER Anushka
EXPOSE 8081
#RUN mvn package

COPY /target/OrderService-0.0.1-SNAPSHOT.jar orderService.jar

ENTRYPOINT ["java", "-jar", "orderService.jar"]