Listar Actores desde dvdrental postgres
Arquitectura basica Component Controller Service

Demo project for Spring Boot 2.6.4 java application with jdbc
JdbcTemplate from package org.springframework.jdbc.core;

spring initializr

dependencies

-Spring Web WEB
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

-Spring JPA DataSQL
Persist data in SQL stores with JPA.
-PostgreSQL Driver SQL

/home/user01/RoomD/servidores/JavaEE/demoJPA

Repositorio juan-ossa / actores-jee-spring.git
 @PostMapping
 @PutMapping(path = "{id}")
@DeleteMapping(path = "{id}")



$ mvn dependency:list


lanzar aplicacion

$ mvn clean install
$ mvn spring-boot:run

/home/user01/RoomD/servidores/JavaEE/demoJPA/target

$ java -jar demoJPA-0.0.1-SNAPSHOT.jar

se habilita datos por consola y las siguientes urls
http://localhost:8080/

http://localhost:8080/api/actor

http://localhost:8080/api/actor/1


http://localhost:8080/hola?name=Juan


http://localhost:8080/swagger-ui/index.html




$ netstat -ano | findstr :8080

$ taskkill /PID [pid] /F


// Unix
lsof -i:8080
kill -9 12345


https://springboot-demo-jco.herokuapp.com/hola

https://springboot-demo-jco.herokuapp.com/api/actor
