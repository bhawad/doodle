FROM maven:3.6.3-jdk-11
WORKDIR /usr/java/
COPY . .
RUN mvn clean package

WORKDIR /usr/app
RUN cp /usr/java/target/*.jar ./app.jar
EXPOSE 9090
CMD ["java","-Dspring.data.mongodb.uri=mongodb://mongo:27017/doodle_db", "-jar", "app.jar"]
