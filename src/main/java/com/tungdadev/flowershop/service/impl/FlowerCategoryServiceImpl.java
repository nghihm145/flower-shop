package com.tungdadev.flowershop.service.impl;

import com.tungdadev.flowershop.entity.FlowerCategory;
import com.tungdadev.flowershop.repository.FlowerCategoryRepository;
import com.tungdadev.flowershop.service.FlowerCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author TungDaDev
 * @since 16/12/2024 - 10:39
 */
@Service
public class FlowerCategoryServiceImpl implements FlowerCategoryService {

    private final FlowerCategoryRepository flowerCategoryRepository;

    public FlowerCategoryServiceImpl(FlowerCategoryRepository flowerCategoryRepository) {
        this.flowerCategoryRepository = flowerCategoryRepository;
    }

    @Override
    public List<FlowerCategory> getAllCategories() {
        return flowerCategoryRepository.findAll();
    }

    @Override
    public Optional<FlowerCategory> getCategoryById(Integer id) {
        return flowerCategoryRepository.findById(id);
    }

    @Override
    public FlowerCategory saveCategory(FlowerCategory category) {
        return flowerCategoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Integer id) {
        flowerCategoryRepository.deleteById(id);
    }
}
