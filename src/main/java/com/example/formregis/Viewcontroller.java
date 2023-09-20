package com.example.formregis;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Viewcontroller {

    private final ViewLoanRepository viewrepository;

    public Viewcontroller(ViewLoanRepository viewrepository) {
        this.viewrepository = viewrepository;
    }

    @GetMapping("/view-data")
    public String viewData(Model model) {
        // Retrieve data from the repository
        Iterable<Viewloan> data = viewrepository.findAll();
        
        // Add data to the model to be displayed in the template
        model.addAttribute("data", data);
        
        // Return the name of your Thymeleaf template (HTML file)
        return "view-data";
    }
}

