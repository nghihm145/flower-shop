package com.tungdadev.flowershop.service;

import com.tungdadev.flowershop.entity.Order;

import java.util.List;
import java.util.Optional;

/**
 * @author TungDaDev
 * @since 16/12/2024 - 10:40
 */
public interface OrderService {

    List<Order> getAllOrders();

    Optional<Order> getOrderById(Integer id);

    List<Order> getOrdersByCustomerId(Integer customerId);

    List<Order> getOrdersByStatus(String status);

    Order saveOrder(Order order);

    void deleteOrder(Integer id);
}
