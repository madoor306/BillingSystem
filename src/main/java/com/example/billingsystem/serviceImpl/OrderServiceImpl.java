package com.example.billingsystem.serviceImpl;

import com.example.billingsystem.entity.OrderDetails;
import com.example.billingsystem.repository.OrderRepository;
import com.example.billingsystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<OrderDetails> findOrderDetailsByFilter(String name, String companyName, String orderReferenceNum, String type) {
        return orderRepository.findByNameOrCompanyNameOrReferenceNumberOrType(name, companyName, orderReferenceNum, type);
    }

    @Override
    public void saveOrder(OrderDetails orderDetails) {
        orderRepository.save(orderDetails);
    }
}
