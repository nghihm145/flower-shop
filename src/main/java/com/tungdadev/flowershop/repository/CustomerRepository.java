package com.tungdadev.flowershop.repository;

import com.tungdadev.flowershop.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author TungDaDev
 * @since 16/12/2024 - 10:34
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // Có thể thêm các phương thức tùy chỉnh nếu cần
}
