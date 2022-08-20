# notes about java, spring boot:

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
    	SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    	return String.format("Hello %s!", name);
    }

}

@RestController annotation tells Spring that this code describes an endpoint that should be made available over the web.

@GetMapping(“/hello”) tells Spring to use our hello() method to answer requests that get sent to the http://localhost:8080/hello address

@RequestMapping() = @RequestMapping(method=GET)

@RequestParam is telling Spring to expect a name value in the request, but if it’s not there, it will use the word “World” by default.

@SpringBootApplication is a convenience annotation that adds all of the following:

@Configuration: Tags the class as a source of bean definitions for the application context.

@EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings. For example, if spring-webmvc is on the classpath, this annotation flags the application as a web application and activates key behaviors, such as setting up a DispatcherServlet.

@ComponentScan: Tells Spring to look for other components, configurations, and services in the com/example package, letting it find the controllers.

MappingJackson2HttpMessageConverter is automatically chosen to convert the any object instance to JSON.

## build &run

./mvnw clean package //build a JAR file

java -jar target/demo-0.0.1-SNAPSHOT.jar //run JAR file

## what is classloader

Classloader: It is the subsystem of JVM that is used to load class files.
