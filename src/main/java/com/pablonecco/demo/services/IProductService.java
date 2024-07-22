package com.pablonecco.demo.services;

import com.pablonecco.demo.entities.Product;

import java.util.List;

public interface IProductService {
    public abstract Product findById(int id);
    public abstract List<Product> findAll();
    public abstract Product insertOrUpdate(Product product);
    public abstract boolean remove (int id);
}
