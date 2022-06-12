FROM gradle:7.4.2-jdk11
COPY . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build
EXPOSE 8080
ENTRYPOINT ["java","-jar","/home/gradle/src/build/libs/Posts-0.0.1-SNAPSHOT.j   ar"]