package sec20SpringBoot.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import sec20SpringBoot.model.entities.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

}
