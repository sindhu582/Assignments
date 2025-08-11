package com.example.ecommerce_app_ass.service;


import com.example.ecommerce_app_ass.model.Order;
import com.example.ecommerce_app_ass.model.CartItem;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderService {
    private Map<Long, Order> orders = new HashMap<>();
    private Long nextOrderId = 1L;

    public Order placeOrder(List<CartItem> items) {
        double total = items.stream()
                .mapToDouble(item -> item.getProduct().getPrice() * item.getQuantity())
                .sum();

        Order order = new Order(nextOrderId++, items, total);
        orders.put(order.getOrderId(), order);
        return order;
    }

    public Order getOrderById(Long id) {
        return orders.get(id);
    }
}

