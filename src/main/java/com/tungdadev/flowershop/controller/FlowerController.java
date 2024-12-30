package com.tungdadev.flowershop.controller;

import com.tungdadev.flowershop.entity.Flower;
import com.tungdadev.flowershop.service.FlowerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author TungDaDev
 * @since 16/12/2024 - 10:44
 */
@RestController
@RequestMapping("/api/flowers")
public class FlowerController {

    private final FlowerService flowerService;

    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public ResponseEntity<List<Flower>> getAllFlowers() {
        return ResponseEntity.ok(flowerService.getAllFlowers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flower> getFlowerById(@PathVariable Integer id) {
        return flowerService.getFlowerById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/search")
    public ResponseEntity<List<Flower>> searchFlowers(@RequestParam String name) {
        return ResponseEntity.ok(flowerService.searchFlowersByName(name));
    }

    @PostMapping
    public ResponseEntity<Flower> createFlower(@RequestBody Flower flower) {
        return ResponseEntity.ok(flowerService.saveFlower(flower));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Flower> updateFlower(@PathVariable Integer id, @RequestBody Flower flower) {
        if (flowerService.getFlowerById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        flower.setId(id);
        return ResponseEntity.ok(flowerService.saveFlower(flower));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFlower(@PathVariable Integer id) {
        flowerService.deleteFlower(id);
        return ResponseEntity.noContent().build();
    }
}
