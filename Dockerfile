FROM openjdk:17
ADD target/Vishnu_maven4docker.jar Vishnu_maven4docker.jar
ENTRYPOINT ["java", "-jar","Vishnu_maven4docker.jar"]