package sec20SpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calc")
public class CalcController {

	@GetMapping("/sum/{firstNumber}/{secondNumber}" )
	public Double sum(
			@PathVariable Double firstNumber,
			@PathVariable Double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	@GetMapping("/subtract")
	public Double subtract(
			@RequestParam(name = "firstNumber") Double firstNumber,
			@RequestParam(name = "secondNumber") Double secondNumber) {
		return firstNumber - secondNumber;
	}
}
