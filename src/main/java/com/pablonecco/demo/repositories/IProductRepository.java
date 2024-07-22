package com.pablonecco.demo.repositories;

import com.pablonecco.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("productRepository")
public interface IProductRepository extends JpaRepository<Product, Serializable> {
    public abstract Product findById (int id);


}
