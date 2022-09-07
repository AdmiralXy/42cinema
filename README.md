## Cinema

### About

Spring MVC and Hibernate web application, movie theater admin panel, real-time WebSocket chat, Freemarker pages.

This repository is the basis for the following project:

[https://github.com/AdmiralXy/42springboot](https://github.com/AdmiralXy/42springboot)

### Dependencies

* Spring
* Spring MVC
* Spring ORM
* Spring WebSocket
* Hibernate
* Freemarker
* H2 Database (in-memory)
* Lombok
* Cargo Maven plugin with Tomcat

### Features

* Embedded database with initial schema and data
* Cinema management:
  * Films
  * Halls
  * Sessions
* Uploading a movie poster
* Finding sessions without page reloads
* Discussion of films in real-time WebSocket chat

### Quick start

**Step 1:** Make sure you have Java 1.8 & Maven package manager

**Step 2:** Run `mvn clean verify cargo:run` to build the project and run the application with embedded Tomcat server

### Pages

* Default URL: http://localhost:8080
* Films page: /admin/panel/films
* Halls page: /admin/panel/halls
* Sessions page: /admin/panel/sessions
* Sessions page with search: /sessions