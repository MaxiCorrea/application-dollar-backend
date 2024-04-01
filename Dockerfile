FROM openjdk:17
VOLUME /tmp
ADD ./target/application-dollar-backend.jar application-dollar-backend.jar
ENTRYPOINT ["java","-jar","/application-dollar-backend.jar","--spring.profiles.active=prod"]