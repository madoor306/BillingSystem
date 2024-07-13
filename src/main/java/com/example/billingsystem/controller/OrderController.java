package com.example.billingsystem.controller;

import com.example.billingsystem.entity.OrderDetails;
import com.example.billingsystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST API Controller.
 * All the endpoints are defined here.
 * Sample endpoint to get order details based on name - http://localhost:8080/v1/billingSystem/orderDetails?name=Seqronics
 */
@RestController
@RequestMapping("/v1/billingSystem")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // You can pass all the request param as filter for the url mentioned above
    @GetMapping(value = "/orderDetails")
    public ResponseEntity<List<OrderDetails>> getOrderDetailsBasedOnFilters(@RequestParam(required = false) String name,
                                                                      @RequestParam(required = false) String companyName,
                                                                      @RequestParam(required = false) String orderReferenceNum,
                                                                      @RequestParam(required = false) String type) {

        List<OrderDetails> orderDetails = orderService.findOrderDetailsByFilter(name, companyName, orderReferenceNum, type);
        return ResponseEntity.ok().body(orderDetails);

    }

    @PostMapping(value = "/orderDetails")
    public ResponseEntity<String> createOrderDetails(@RequestBody OrderDetails orderDetails) {

        orderService.saveOrder(orderDetails);
        return ResponseEntity.ok().body("Order details saved");
    }

}
