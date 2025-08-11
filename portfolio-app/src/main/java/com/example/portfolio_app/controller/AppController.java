package com.example.portfolio_app.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class AppController {
	
    @GetMapping("/")
    public String showHomePage() {
        return "home"; // This will map to /templates/home.html
    }
    @GetMapping("/about")
    public String aboutPage() {
        return "about"; // Resolves to /templates/about.html
    }
    @GetMapping("/education")
    public String educationPage() {
        return "education"; // Resolves to /templates/about.html
    }
    @GetMapping("/skills")
    public String skillsPage() {
        return "skills"; // Resolves to /templates/about.html
    }
    @GetMapping("/contact")
    public String contactPage() {
        return "contact"; // Resolves to /templates/about.html
    }

}
