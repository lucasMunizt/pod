package br.edu.uni7.hello;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    public Product create(Product product){
        products.add(product);

        return  product;
    }

    public List<Product> findAll(){
        return products;
    }

    public Product delete(String name) {
        Product result = null;


        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)){
                result = product;
                this.products.remove(product);
            }
        }

        return result;
    }
}
