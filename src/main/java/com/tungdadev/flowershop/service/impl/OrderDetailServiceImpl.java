package com.tungdadev.flowershop.service.impl;

import com.tungdadev.flowershop.entity.OrderDetail;
import com.tungdadev.flowershop.repository.OrderDetailRepository;
import com.tungdadev.flowershop.service.OrderDetailService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author TungDaDev
 * @since 16/12/2024 - 10:42
 */
@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    private final OrderDetailRepository orderDetailRepository;

    public OrderDetailServiceImpl(OrderDetailRepository orderDetailRepository) {
        this.orderDetailRepository = orderDetailRepository;
    }

    @Override
    public List<OrderDetail> getAllOrderDetails() {
        return orderDetailRepository.findAll();
    }

    @Override
    public List<OrderDetail> getOrderDetailsByOrderId(Integer orderId) {
        return orderDetailRepository.findByOrderId(orderId);
    }

    @Override
    public List<OrderDetail> getOrderDetailsByFlowerId(Integer flowerId) {
        return orderDetailRepository.findByFlowerId(flowerId);
    }

    @Override
    public OrderDetail saveOrderDetail(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }

    @Override
    public void deleteOrderDetail(Integer id) {
        orderDetailRepository.deleteById(id);
    }
}
