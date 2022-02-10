// followed example: https://spring.io/guides/gs/accessing-data-mysql/
// Language: java
package com.example.accessingdatamysql;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


// Create an entity model User with id, name, email, and password. Include a method for setName, setEmail, and setPassword.
@Entity
public class User {
    //Create variables for the user's id, name, email, and password.

    // create a variable for the user's salary 

    
    //Create a constructor for the User class.

    // Create a getter for each variable in the User class.

}


// Create the repository UserRepository that contains the User Records. Use CRUD Repository as the base class.
public 


// Create a controller called MainController to handle HTTP requests to the application. Inlude a method to handle GET requests to /users in UserRepository and return a list of all users. Also include a method to handle POST requests to /users and UserReporistory and create a new user and store it in the database.
@Controller
public class 


// Create a Spring Boot application called MyApp that uses the MainController to handle HTTP requests.
@SpringBootApplication
public 


// On startup of the application, add a new user to the database to test the application. Add a username of "user1" and a password of "password1", with a salary of 100000. Generate and add a random email address. Generate and add an id, and store the user in the database.
@Bean
public 

