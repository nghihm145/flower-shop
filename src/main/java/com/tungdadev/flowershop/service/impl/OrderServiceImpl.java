package com.tungdadev.flowershop.service.impl;

import com.tungdadev.flowershop.entity.Order;
import com.tungdadev.flowershop.repository.OrderRepository;
import com.tungdadev.flowershop.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author TungDaDev
 * @since 16/12/2024 - 10:41
 */
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> getOrderById(Integer id) {
        return orderRepository.findById(id);
    }

    @Override
    public List<Order> getOrdersByCustomerId(Integer customerId) {
        return orderRepository.findByCustomerId(customerId);
    }

    @Override
    public List<Order> getOrdersByStatus(String status) {
        return orderRepository.findByStatus(status);
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Integer id) {
        orderRepository.deleteById(id);
    }
}
