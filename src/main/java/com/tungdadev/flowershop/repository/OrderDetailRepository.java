package com.tungdadev.flowershop.repository;

import com.tungdadev.flowershop.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author TungDaDev
 * @since 16/12/2024 - 10:36
 */
@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
    // Lấy chi tiết đơn hàng theo mã đơn hàng
    List<OrderDetail> findByOrderId(Integer orderId);

    // Lấy chi tiết đơn hàng theo mã hoa
    List<OrderDetail> findByFlowerId(Integer flowerId);
}
