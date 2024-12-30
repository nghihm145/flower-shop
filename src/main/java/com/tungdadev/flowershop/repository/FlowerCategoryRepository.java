package com.tungdadev.flowershop.repository;

import com.tungdadev.flowershop.entity.FlowerCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author TungDaDev
 * @since 16/12/2024 - 10:35
 */
@Repository
public interface FlowerCategoryRepository extends JpaRepository<FlowerCategory, Integer> {
    // Có thể thêm các phương thức tùy chỉnh nếu cần
}
