FROM openjdk:latest
VOLUME /tmp
ADD target/IbanCheckAPI-0.0.1-SNAPSHOT.jar app-iban.jar
ENTRYPOINT ["java", "-jar", "/app-iban.jar"]