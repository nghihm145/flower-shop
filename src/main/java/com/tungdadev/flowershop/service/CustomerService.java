package com.tungdadev.flowershop.service;

import com.tungdadev.flowershop.entity.Customer;

import java.util.List;
import java.util.Optional;

/**
 * @author TungDaDev
 * @since 16/12/2024 - 10:28
 */
public interface CustomerService {

    List<Customer> getAllCustomers();

    Optional<Customer> getCustomerById(Integer id);

    Customer saveCustomer(Customer customer);

    void deleteCustomer(Integer id);
}
