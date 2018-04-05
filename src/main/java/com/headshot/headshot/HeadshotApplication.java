package com.headshot.headshot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class HeadshotApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeadshotApplication.class, args);
	}
        
        @Controller @RequestMapping("/headshot") public class ExemploController {
@RequestMapping("/home")
public String home(Model modelo) {
       return "index";
   }

@RequestMapping("/carrinho")
public String carrinho(Model modelo) {
       return "carrinho";
   }


@RequestMapping("/detalhe")
public String detalhe(Model modelo) {
       return "produto";
   }
}
}
