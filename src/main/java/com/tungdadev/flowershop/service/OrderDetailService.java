package com.tungdadev.flowershop.service;

import com.tungdadev.flowershop.entity.OrderDetail;

import java.util.List;

/**
 * @author TungDaDev
 * @since 16/12/2024 - 10:41
 */
public interface OrderDetailService {

    List<OrderDetail> getAllOrderDetails();

    List<OrderDetail> getOrderDetailsByOrderId(Integer orderId);

    List<OrderDetail> getOrderDetailsByFlowerId(Integer flowerId);

    OrderDetail saveOrderDetail(OrderDetail orderDetail);

    void deleteOrderDetail(Integer id);
}
