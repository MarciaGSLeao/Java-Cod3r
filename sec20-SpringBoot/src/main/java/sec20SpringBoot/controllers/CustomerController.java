package sec20SpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sec20SpringBoot.models.entities.Customers;

@RestController
@RequestMapping(path = "/customer")
public class CustomerController {

	@GetMapping(path = "/any")
	public Customers getCostumer() {
		return new Customers(1, "Márcia Gameleira", "000.111.222-33");
	}
	
	@GetMapping("/{id}")
	public Customers getCustomerById1(@PathVariable int id) {
		return new Customers(id, "Felipe Gameleira", "111.222.333-44");
	}
	
	@GetMapping
	public Customers getCustomerById2(
			@RequestParam(name = "id") int id) {
		return new Customers(id, "Helena Gameleira", "222.333.444-55");
	}
}
