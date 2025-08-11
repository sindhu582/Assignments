package com.example.ecommerce_app_ass.service;

import com.example.ecommerce_app_ass.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> productList = new ArrayList<>();
    private Long nextId = 4L; // To generate unique IDs

    public ProductService() {
        productList.add(new Product(1L, "Laptop", 95000.00, "High-end gaming laptop"));
        productList.add(new Product(2L, "Mobile", 35000.00, "Latest Android smartphone"));
        productList.add(new Product(3L, "Headphones", 5000.00, "Noise cancelling headphones"));
    }

    public List<Product> getAllProducts() {
        return productList;
    }

    public Product getProductById(Long id) {
        return productList.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public void saveProduct(Product product) {
        if (product.getId() == null) {
            product.setId(nextId++);
            productList.add(product);
        } else {
            // update existing
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getId().equals(product.getId())) {
                    productList.set(i, product);
                    return;
                }
            }
        }
    }

    public void deleteProductById(Long id) {
        productList.removeIf(p -> p.getId().equals(id));
    }


	}

