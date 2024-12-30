package com.tungdadev.flowershop.service.impl;

import com.tungdadev.flowershop.entity.Flower;
import com.tungdadev.flowershop.repository.FlowerRepository;
import com.tungdadev.flowershop.service.FlowerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author TungDaDev
 * @since 16/12/2024 - 10:40
 */
@Service
public class FlowerServiceImpl implements FlowerService {

    private final FlowerRepository flowerRepository;

    public FlowerServiceImpl(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    @Override
    public List<Flower> getAllFlowers() {
        return flowerRepository.findAll();
    }

    @Override
    public Optional<Flower> getFlowerById(Integer id) {
        return flowerRepository.findById(id);
    }

    @Override
    public List<Flower> searchFlowersByName(String name) {
        return flowerRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public Flower saveFlower(Flower flower) {
        return flowerRepository.save(flower);
    }

    @Override
    public void deleteFlower(Integer id) {
        flowerRepository.deleteById(id);
    }
}
