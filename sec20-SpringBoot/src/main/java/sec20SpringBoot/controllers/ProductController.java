package sec20SpringBoot.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sec20SpringBoot.model.entities.Product;
import sec20SpringBoot.model.repositories.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	/*
	@PostMapping
	public @ResponseBody Product newProduct(
			@RequestParam String name,
			@RequestParam Double price,
			@RequestParam Double discount) {
		Product product = new Product(name, price, discount);
		productRepository.save(product);
		return product;		
	}
	---- OU SIMPLESMENTE CONFORME ABAIXO...
	*/
	
//	@PostMapping
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Product newProduct(@Valid Product product) {
		productRepository.save(product);
		return product;		
	}
	
	/*
	@GetMapping("/searchall")
	public Iterable<Product> getAllProducts(){
		return productRepository.findAll();
	}
	*/
	
	@GetMapping(path="/{id}")
	public Optional<Product> getProductById(@PathVariable Integer id) {
		return productRepository.findById(id);
	}
	
	@GetMapping(path="/name/{partOfName}")
	public Iterable<Product> getProductByPartOfName(@PathVariable String partOfName){
		 return productRepository.findByNameContainingIgnoreCase(partOfName);
		// return productRepository.searchByNameLike(partOfName);
	}
	
	// MÉTODO PARA PAGINAÇÃO DE ELEMENTOS.
	@GetMapping(path="/page/{pageNumber}/{qtdElementsOnPage}")
	public Iterable<Product> getProductsByPages(@PathVariable Integer pageNumber, @PathVariable Integer qtdElementsOnPage){
		if (qtdElementsOnPage > 10) qtdElementsOnPage = 10;
		PageRequest page = PageRequest.of(pageNumber, qtdElementsOnPage);
		return productRepository.findAll(page);
	}
	
	/*
	@PutMapping
	public Product alterProduct(@Valid Product product) {
		return productRepository.save(product);
	}
	*/
	
	@DeleteMapping(path = "/{id}")
	public void deletProduct(@PathVariable Integer id) {
		productRepository.deleteById(id);
	}

}
