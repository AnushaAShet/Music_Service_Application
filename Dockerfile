FROM openjdk:11-jdk-stretch

ADD /target/musicservice-0.0.1-SNAPSHOT.jar /src/app/music/musicservice-0.0.1-SNAPSHOT.jar

WORKDIR /src/app/music

ENTRYPOINT ["java","-jar","musicservice-0.0.1-SNAPSHOT.jar"]