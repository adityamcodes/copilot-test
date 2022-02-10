// followed example: https://spring.io/guides/gs/accessing-data-mysql/
// Language: java
package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


// Import all classes, methods, and packages, needed to run the Spring Boot application.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


// Create an entity model User with id, name, email, and password. Include a method for setName, setEmail, and setPassword.
@Entity
public class User {
    //Create variables for the user's id, name, email, and password.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String password;
    // create a variable for the user's salary 
    private double salary;
    
    //Create a constructor for the User class.
    public User(String name, String email, String password, double salary) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.salary = salary;
    }

    // Create a getter for each variable in the User class.
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public double getSalary() {
        return salary;
    }


}


// Create the repository UserRepository that contains the User Records. Use CRUD Repository as the base class.
public interface UserRepository extends CrudRepository<User, Long> {
}


// Create a controller called MainController to handle HTTP requests to the application. Inlude a method to handle GET requests to /users in UserRepository and return a list of all users. Also include a method to handle POST requests to /users and UserReporistory and create a new user and store it in the database.
@Controller
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}


// Create a Spring Boot application called MyApp that uses the MainController to handle HTTP requests.
@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}


// On startup of the application, add a new user to the database to test the application. Add a username of "user1" and a password of "password1", with a salary of 100000. Generate and add a random email address. Generate and add an id, and store the user in the database.
@Bean
public CommandLineRunner demo(UserRepository userRepository) {
    return (args) -> {
        userRepository.save(new User("user1", "password1", 100000));
    };
}


// Create an event listener for the application MyApp that will be called when the application starts.
@EventListener(ApplicationReadyEvent.class)
public void appReady() {
    System.out.println("Application is ready!");

    // Get & print all users in the UserRepository
    List<User> users = userRepository.findAll();
    System.out.println("Users found with findAll():");
    System.out.println("-------------------------------");
    for (User user : users) {
        System.out.println(user);
    }
    System.out.println();

}