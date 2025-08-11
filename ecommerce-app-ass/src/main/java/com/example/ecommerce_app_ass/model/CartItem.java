package com.example.ecommerce_app_ass.model;

import jakarta.persistence.Entity;

//@Entity
public class CartItem {
    private Product product;
    private int quantity;
	public Product getProduct() {
		return product;
	}
	
	public CartItem(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CartItem [product=" + product + ", quantity=" + quantity + "]";
	}
    
}
