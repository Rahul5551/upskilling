package net.java12.springboot.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
//HTTP GET Request


    @GetMapping ("/hello-world")
    public String helloworld(){
        return "Hello World!";
    }
}
