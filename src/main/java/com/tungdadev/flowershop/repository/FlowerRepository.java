package com.tungdadev.flowershop.repository;

import com.tungdadev.flowershop.entity.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author TungDaDev
 * @since 16/12/2024 - 10:35
 */
@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {
    // Tìm kiếm hoa theo tên
    List<Flower> findByNameContainingIgnoreCase(String name);
}
