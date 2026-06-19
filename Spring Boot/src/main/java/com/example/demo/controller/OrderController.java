package com.example.demo.controller;

import com.example.demo.entity.Orders;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService service;

    @PostMapping("/{customerId}/{productId}/{qty}")
    public Orders placeOrder(@PathVariable Long customerId ,@PathVariable Long productId ,@PathVariable int qty){

        return service.placeOrder(customerId,productId,qty);
    }


    @GetMapping
    List<Orders> getAllOrders(){
        return service.getAllOrders();
    }

    @PutMapping("/{orderId}/{qty}")
    public Orders updateOrder(
            @PathVariable Long orderId,
            @PathVariable int qty){

        return service.updateOrder(orderId, qty);
    }

    @DeleteMapping("/{orderId}")
    public String deleteOrder(
            @PathVariable Long orderId){

        service.deleteOrder(orderId);

        return "Order Deleted Successfully";
    }

    @GetMapping("/count/{customerId}")
    public Long countOrders(
            @PathVariable Long customerId){

        return service.countOrders(customerId);
    }

    @GetMapping("/amount/{customerId}")
    public double totalAmount(
            @PathVariable Long customerId){

        return service.totalAmount(customerId);
    }

    @GetMapping("/revenue")
    public double totalRevenue() {
        return service.totalRevenue();
    }
}