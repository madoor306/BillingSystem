package com.example.billingsystem.service;

import com.example.billingsystem.entity.OrderDetails;

import java.util.List;

public interface OrderService {

    public List<OrderDetails> findOrderDetailsByFilter(String name, String companyName, String orderReferenceNum, String type);

    public void saveOrder(OrderDetails orderDetails);
}
