package br.org.generation.hello.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DemoApplication;

   @RestController
public class ControllerTeste {
   @GetMapping("/hello")
    
   public String sayHello() {
	   return "<h1>Hello World!!! \n Nosso Primeiro projeto Spring</h1>";
   }
	
}
