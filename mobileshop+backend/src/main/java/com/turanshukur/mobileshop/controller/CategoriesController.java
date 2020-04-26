package com.turanshukur.mobileshop.controller;

import com.turanshukur.mobileshop.model.Categories;
import com.turanshukur.mobileshop.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

    @Autowired
    private CategoriesService categoriesService;

    @PostMapping("/save")
    public void save(@RequestBody Categories categories){
        categoriesService.saveCategory(categories);
    }

    @GetMapping("")
    public List<Categories> getAll(){
        return  categoriesService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Optional<Categories> getById(@PathVariable Long id){
        return categoriesService.getCategoryById(id);
    }

    @DeleteMapping("/{id}")

    public void delete(@PathVariable Long id){
        categoriesService.deleteCategoryById(id);
    }

}
