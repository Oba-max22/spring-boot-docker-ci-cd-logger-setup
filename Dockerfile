FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/decadevs-docker-macaulay.jar decadevs-docker-macaulay.jar
ENTRYPOINT ["java", "-jar", "decadevs-docker-macaulay.jar"]
