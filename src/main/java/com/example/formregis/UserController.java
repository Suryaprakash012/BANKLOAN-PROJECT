package com.example.formregis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @GetMapping("/home")
    public String showRegistrationFor() {
        return "home";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/register")
    public String processRegistration(@ModelAttribute("user") User user) {
        // You should add validation and error handling here
        user.setEnabled(true);
        userRepository.save(user);
        return "/login";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        com.example.formregis.User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return "loan"; // Redirect to a welcome page on successful login
        } else {
            // Handle login failure, show an error message, etc.
            return "error";}
        }
     
        @GetMapping("/admin")
        public String showLoginFom() {
            return "admin";
        }
        @PostMapping("/admin")
        public String admin(@RequestParam String username, @RequestParam String password) {
            com.example.formregis.User user = userRepository.findByUsername(username);
            if (user != null && user.getPassword().equals(password)) {
                return "view-data"; // Redirect to a welcome page on successful login
            } else {
                // Handle login failure, show an error message, etc.
                return "error";
            }  
         
      
      
    
}}
