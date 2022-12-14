package sec20SpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/first")
public class FirstController {
	
	// @RequestMapping (method = RequestMethod.GET, path = "/ola") OU...
	@GetMapping
	// OPÇÃO DE INSERIR URL's ALTERNATIVAS PARA O @GetMapping (path = {"/hello1", "hello2"})
	public String hello() {
		return "Hello, Spring Boot!";
	}
}
