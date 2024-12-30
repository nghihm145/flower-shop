package com.tungdadev.flowershop.service;

import com.tungdadev.flowershop.entity.Flower;

import java.util.List;
import java.util.Optional;

/**
 * @author TungDaDev
 * @since 16/12/2024 - 10:39
 */
public interface FlowerService {

    List<Flower> getAllFlowers();

    Optional<Flower> getFlowerById(Integer id);

    List<Flower> searchFlowersByName(String name);

    Flower saveFlower(Flower flower);

    void deleteFlower(Integer id);
}
