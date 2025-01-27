FROM openjdk:17

COPY target/civilink-eureka.jar .

EXPOSE 8761

ENTRYPOINT ["java","-jar","civilink-eureka.jar"]
