FROM openjdk:19-jdk

VOLUME /tmp

ADD ./target/dockerDemo*.jar /app.jar

CMD ["java","-jar","/app.jar","--spring.profiles.active=prod"]

EXPOSE 8080

