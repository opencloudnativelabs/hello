package org.aditya.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {

	@GetMapping("/")
	public String index(){
		return "<html><head><title>Welcome to Hello Application</title></head><body><h1><hr size=\"20\" color=\"blue\"><p style=\"text-align:center;\">Welcome to the Hello World</p></hr></h1></body></html>";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
