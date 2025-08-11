package com.example.ecommerce_app_ass.controller;

import com.example.ecommerce_app_ass.model.CartItem;
import com.example.ecommerce_app_ass.model.Product;
import com.example.ecommerce_app_ass.service.ProductService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Home (optional)
    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("message", "Welcome to E-Commerce App!");
        return "home"; // create home.html if needed
    }

    // List all products
    @GetMapping("/products")
    public String viewProducts(Model model) {
        model.addAttribute("productList", productService.getAllProducts());
        return "products";
    }

    // View product details
    @GetMapping("/products/{id}")
    public String viewProductDetails(@PathVariable Long id, Model model) {
        Product product = productService.getProductById(id);
        if (product == null) return "redirect:/products";
        model.addAttribute("product", product);
        model.addAttribute("action", null); // view-only mode
        return "product-details";
    }

    // Show Add Product Form
    @GetMapping("/products/new")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product(null, null, 0, null));
        model.addAttribute("action", "Add");
        return "product-details";
    }

    // Save New or Updated Product
    @PostMapping("/products/save")
    public String saveProduct(@ModelAttribute Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
    }

    // Edit Product Form
    @GetMapping("/products/edit/{id}")
    public String editProduct(@PathVariable Long id, Model model) {
        Product product = productService.getProductById(id);
        if (product == null) return "redirect:/products";
        model.addAttribute("product", product);
        model.addAttribute("action", "Edit");
        return "product-details";
    }

    // Delete product
    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProductById(id);
        return "redirect:/products";
    }

    // View cart
    @GetMapping("/cart")
    public String viewCart(HttpSession session, Model model) {
        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
        if (cart == null) cart = new ArrayList<>();
        model.addAttribute("cartItems", cart);
        return "cart";
    }

    // Add to cart
    @PostMapping("/add-to-cart")
    public String addToCart(@RequestParam Long productId, HttpSession session) {
        Product product = productService.getProductById(productId);
        if (product == null) return "redirect:/products";

        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
        if (cart == null) cart = new ArrayList<>();

        boolean found = false;
        for (CartItem item : cart) {
            if (item.getProduct().getId().equals(productId)) {
                item.setQuantity(item.getQuantity() + 1);
                found = true;
                break;
            }
        }

        if (!found) cart.add(new CartItem(product, 1));
        session.setAttribute("cart", cart);
        return "redirect:/cart";
    }

    // Remove from cart
    @PostMapping("/remove-from-cart")
    public String removeFromCart(@RequestParam Long productId, HttpSession session) {
        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
        if (cart != null) {
            cart.removeIf(item -> item.getProduct().getId().equals(productId));
            session.setAttribute("cart", cart);
        }
        return "redirect:/cart";
    }
}
