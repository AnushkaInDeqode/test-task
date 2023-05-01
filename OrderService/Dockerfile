FROM adoptopenjdk/openjdk11:alpine-jre
MAINTAINER Anushka
EXPOSE 8081
#RUN mvn package

COPY /target/.jar orderService.jar

ENTRYPOINT ["java", "-jar", "orderService.jar"]