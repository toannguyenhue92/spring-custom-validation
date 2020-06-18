package toan.myvalidator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import toan.myvalidator.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("")
    public String showEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee/form";
    }

    @PostMapping("/validate")
    public String showEmployeeForm(@Validated @ModelAttribute Employee employee,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "employee/form";
        }
        return "employee/result";
    }
}
