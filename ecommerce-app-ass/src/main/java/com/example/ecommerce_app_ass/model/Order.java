package com.example.ecommerce_app_ass.model;

import java.util.List;

import jakarta.persistence.Entity;

//@Entity
public class Order {
    private Long orderId;
    private List<CartItem> items;
    private double totalPrice;

    public Order() {}
    public Order(Long orderId, List<CartItem> items, double totalPrice) {
        this.orderId = orderId;
        this.items = items;
        this.totalPrice = totalPrice;
    }
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public List<CartItem> getItems() {
		return items;
	}
	public void setItems(List<CartItem> items) {
		this.items = items;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", items=" + items + ", totalPrice=" + totalPrice + "]";
	}
    
}
