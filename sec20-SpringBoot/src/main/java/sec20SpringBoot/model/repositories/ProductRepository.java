package sec20SpringBoot.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import sec20SpringBoot.model.entities.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {
	
	public Iterable<Product> findByNameContainingIgnoreCase(String partOfName);
	
//	findByNameContaining
//	findByNameIsContaining
//	findByNameContains
//	
//	findByNameStartsWith
//	findByNameEndsWith
//	
//	findByNameNotContaining
	
//	@Query("SELECT p FROM Product WHERE p.name LIKE %:name%")
//	public Iterable<Product> searchByNameLike(@Param("name") String name);

}
