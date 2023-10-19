package br.edu.uni7.hello;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private ProductRepository productRepository = new ProductRepository();

    @PostMapping("/products")
    public Product save(String name, String description, Double price){
        Product product = new Product(name, description, price);

        product = productRepository.create(product);

        return product;
    }

    @GetMapping("/products")
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @DeleteMapping("/products")
    public Product remove(String name){
        return productRepository.delete(name);
    }
}
