package com.tungdadev.flowershop.repository;

import com.tungdadev.flowershop.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author TungDaDev
 * @since 16/12/2024 - 10:35
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    // Tìm kiếm tất cả các đơn hàng theo trạng thái
    List<Order> findByStatus(String status);

    // Tìm kiếm tất cả đơn hàng theo mã khách hàng
    List<Order> findByCustomerId(Integer customerId);
}
