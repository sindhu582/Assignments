package com.example.ecommerce_app_ass.controller;

import com.example.ecommerce_app_ass.model.CartItem;
import com.example.ecommerce_app_ass.model.Order;
import com.example.ecommerce_app_ass.service.OrderService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/place-order")
    public String placeOrder(HttpSession session, Model model) {
        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
        if (cart == null || cart.isEmpty()) {
            return "redirect:/cart";
        }

        Order order = orderService.placeOrder(cart);
        session.removeAttribute("cart");
        model.addAttribute("order", order);
        return "order-confirmation";
    }
}

