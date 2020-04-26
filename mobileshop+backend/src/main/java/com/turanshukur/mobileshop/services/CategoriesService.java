package com.turanshukur.mobileshop.services;

import com.turanshukur.mobileshop.model.Categories;
import com.turanshukur.mobileshop.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    public void saveCategory(Categories categories) {
            categoriesRepository.save(categories);
    }

    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }

    public Optional<Categories> getCategoryById(Long id) {
        return categoriesRepository.findById(id);
    }

    public void deleteCategoryById(Long id) {
        categoriesRepository.deleteById(id);
    }
}
