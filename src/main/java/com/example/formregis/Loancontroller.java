package com.example.formregis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Loancontroller {

    @Autowired
    private LoanRepository loanRepository;

    @GetMapping("/loan")
    public String showRegistrationForm(Model model) {
        model.addAttribute("loanapply", new Loanapply());
        return "loan";
    }

    @PostMapping("/loan")
    public String processRegistration(@ModelAttribute("loanapply") Loanapply loanapply) {
        // You should add validation and error handling here
    	loanRepository.save(loanapply);
        return "appliyed";
    }
}
