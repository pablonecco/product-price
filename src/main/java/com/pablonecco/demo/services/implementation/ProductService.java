package com.pablonecco.demo.services.implementation;

import com.pablonecco.demo.entities.Product;
import com.pablonecco.demo.repositories.IProductRepository;
import com.pablonecco.demo.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductService implements IProductService {

    @Autowired
    @Qualifier("productRepository")
    private IProductRepository productRepository;

    public  Product findById(int id) {
        return productRepository.findById(id);
    }
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    public Product insertOrUpdate(Product product) {
        productRepository.save(product);
        return product;
    }
    public boolean remove (int id) {
        try {
            productRepository.deleteById(id);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
