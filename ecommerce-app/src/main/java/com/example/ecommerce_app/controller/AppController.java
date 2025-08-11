package com.example.ecommerce_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ecommerce_app.exception.ResourceNotFoundException;
import com.example.ecommerce_app.model.Customer;
import com.example.ecommerce_app.service.CustomerService;

@Controller
public class AppController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/home")
	public String showHomePage(Model model) {
		List<Customer> customersList = customerService.getAllCustomers();
		System.out.println(" customer list "+customersList.size());
		model.addAttribute("customerList", customersList);
		return "home";
	}
	@GetMapping("/add-customer")
	public String showAddCustomerPage(Model model) {
		Customer c = new Customer();
		model.addAttribute("customer", c);
		return "add-customer";
	}
	
	 @PostMapping("/save-customer")
	    public String saveCustomer(@ModelAttribute("customer") Customer customer,RedirectAttributes model) {
	    	System.out.println(" inside save Customer "+customer);
	    	customerService.saveCustomer(customer);
	    	model.addFlashAttribute("message", "Customer Added Successfully");
	    	return "redirect:/home";
	    }
	 @GetMapping("/edit/{id}")
	 public String showEditCustomer(Model model, @PathVariable Long id) throws ResourceNotFoundException {
		 Customer customer = customerService.getCustomerById(id);
		 if(customer != null)
			 model.addAttribute("customer", customer);
		 else
			 throw new  ResourceNotFoundException("Customer not found with '"+id+"'");
		 return "edit-customer";
	 }
	 
	 @PostMapping("/update-customer")
	    public String updateCustomer(@ModelAttribute("customer") Customer customer) throws ResourceNotFoundException {
	    	System.out.println(" inside save Customer "+customer);
	    	Customer existingCustomer = customerService.getCustomerById(customer.getId());
	    	existingCustomer.setName(customer.getName());
	    	existingCustomer.setPassword(customer.getPassword());
	    	existingCustomer.setEmail(customer.getEmail());
	    	
	    	customerService.saveCustomer(existingCustomer);
	    	return "redirect:/home";
	    	
	    }
	 
	 @GetMapping("/delete/{id}")
	 public String showDeleteCustomer( @PathVariable Long id) throws ResourceNotFoundException {
		 Customer customer = customerService.getCustomerById(id);
		 customerService.deleteCustomer(id);
		// model.addAttribute("customer", customer);
		 return "redirect:/home";
	 }
	 
	

}
