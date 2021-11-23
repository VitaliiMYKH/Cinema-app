# Cinema service
Here are simple implementation of cinema service app.
App is created based on SOLID principles and have 3-tier architecture.
Using this app, user can register, and buy ticket for an available movie.
Authentication and authorization is realized with Spring Security,
if you don`t want to register new user, you can some which already in the system:
- {login: user@gmail.com, password: u12345, Role: user} 
- {login: admin@gmail.com, password: a12345, Role: admin} </br>
It is recommended to use Postman for sending POST requests.

## Technologies used in this app:
- JDK 11
- Tomcat version 9.0.54
- Maven
- Hibernate
- MySQL Database
- Spring Core
- Spring Security
- Spring Web

## This app has following endpoints:
- Registration(POST:/register), authentication(/login), authorization and logout(/logout) processes
- Add movie session to shopping cart (PUT: /shopping-carts/movie-sessions?movieSessionId)
- Get shopping cart by user (GET: /shopping-carts/by-user)
- Add cinema hall (POST: /cinema-halls)
- Get all cinema halls (GET: /cinema-halls)
- Add movie (POST: /movies)
- Get all movies (GET: /movies) 
- Add movie sessions(POST: /movie-sessions)
- Get all available movie sessions (GET: /movie-sessions/available?movieId&date)
- Delete or update movie session by id (DELETE: /movie-sessions/{id})
- Complete order (POST: /orders/complete)
- Get orders history for user (GET: /orders)
- Get user by email (GET: /users/by-email?email)

## To deploy this project you need to:
- Install Tomcat web-server version 9.54
- Install MySQL DBMS
- Fork this project to your repository
- Clone it locally in your IDE
- Open this file(src/main/resources/db.properties), and change db credentials
- Configure Tomcat in your IDE
- Run project and register your user
