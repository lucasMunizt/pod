package br.edu.uni7.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApplication {
@GetMapping("/hello")
    public String sayHello(String name){
    return "hello, "+ name +"!";
}
}
