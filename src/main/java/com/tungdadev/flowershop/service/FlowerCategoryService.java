package com.tungdadev.flowershop.service;

import com.tungdadev.flowershop.entity.FlowerCategory;

import java.util.List;
import java.util.Optional;

/**
 * @author TungDaDev
 * @since 16/12/2024 - 10:38
 */
public interface FlowerCategoryService {
    List<FlowerCategory> getAllCategories();

    Optional<FlowerCategory> getCategoryById(Integer id);

    FlowerCategory saveCategory(FlowerCategory category);

    void deleteCategory(Integer id);
}
