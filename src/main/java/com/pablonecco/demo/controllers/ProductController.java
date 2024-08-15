package com.pablonecco.demo.controllers;

import com.pablonecco.demo.entities.Product;
import com.pablonecco.demo.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProductController {

    @Autowired
    @Qualifier("productService")
    private IProductService productService;

    @GetMapping("/products")
    @CrossOrigin(origins = "http://127.0.0.1:5500/")
    public List<Product> getAll () {
        return productService.findAll();
    }

    @GetMapping("/products/{id}")
    public Product findById (@PathVariable("id") int id) {
        return productService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteById (@PathVariable("id") int id) {
        return productService.remove(id);
    }

    @PostMapping("/create")
    public Product createProduct (@RequestBody Product product) {
        return productService.insertOrUpdate(product);
    }
}
