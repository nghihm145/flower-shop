package com.tungdadev.flowershop.controller;

import com.tungdadev.flowershop.entity.FlowerCategory;
import com.tungdadev.flowershop.service.FlowerCategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author TungDaDev
 * @since 16/12/2024 - 10:44
 */
@RestController
@RequestMapping("/api/flower-categories")
public class FlowerCategoryController {

    private final FlowerCategoryService flowerCategoryService;

    public FlowerCategoryController(FlowerCategoryService flowerCategoryService) {
        this.flowerCategoryService = flowerCategoryService;
    }

    @GetMapping
    public ResponseEntity<List<FlowerCategory>> getAllCategories() {
        return ResponseEntity.ok(flowerCategoryService.getAllCategories());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FlowerCategory> getCategoryById(@PathVariable Integer id) {
        return flowerCategoryService.getCategoryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<FlowerCategory> createCategory(@RequestBody FlowerCategory category) {
        return ResponseEntity.ok(flowerCategoryService.saveCategory(category));
    }

    @PutMapping("/{id}")
    public ResponseEntity<FlowerCategory> updateCategory(@PathVariable Integer id, @RequestBody FlowerCategory category) {
        if (flowerCategoryService.getCategoryById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        category.setId(id);
        return ResponseEntity.ok(flowerCategoryService.saveCategory(category));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Integer id) {
        flowerCategoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
}
