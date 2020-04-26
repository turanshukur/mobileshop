package com.turanshukur.mobileshop.services;

import com.turanshukur.mobileshop.model.Products;
import com.turanshukur.mobileshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public List<Products> getProducts() {
        return productRepository.findAll();
    }

    public ResponseEntity<Products> saveProducts(Products products) {
        Products products1 = productRepository.save(products);
        return new ResponseEntity<>(products1, HttpStatus.OK);
    }

    public Optional<Products> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);

    }
}
