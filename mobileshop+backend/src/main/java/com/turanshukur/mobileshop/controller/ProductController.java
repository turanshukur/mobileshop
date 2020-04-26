package com.turanshukur.mobileshop.controller;

import com.turanshukur.mobileshop.model.Products;
import com.turanshukur.mobileshop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/save")
    public ResponseEntity<Products> save(@RequestBody Products products){
        productService.saveProducts(products);
        return new ResponseEntity<Products>(HttpStatus.OK);
    }

    @GetMapping("")
    public  List<Products> getAll(@RequestBody Products products){
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Optional<Products> getById(@PathVariable Long id){
        return productService.getProductById(id);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        productService.deleteProductById(id);
    }
}
