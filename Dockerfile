FROM openjdk:17
ADD target/*.jar *.jar
ENTRYPOINT [ "java","-jar","*.jar" ]
EXPOSE 8080