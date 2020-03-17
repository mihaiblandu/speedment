FROM openjdk:11
COPY ./target/demo-1.0.0-SNAPSHOT.jar /myapp/app.jar
WORKDIR /myapp
EXPOSE 8080
CMD $JAVA_HOME/bin/java $JAVA_OPTS -jar /myapp/*.jar