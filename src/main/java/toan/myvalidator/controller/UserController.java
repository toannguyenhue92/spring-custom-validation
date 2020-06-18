package toan.myvalidator.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import toan.myvalidator.model.User;

@Controller
public class UserController {

    @GetMapping(path = "/")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "user/form";
    }

    @PostMapping(path = "/")
    public String saveUser(@Valid @ModelAttribute User user, BindingResult bindingResult,
            Model model) {
        if (bindingResult.hasErrors()) {
            return "user/form";
        }
        model.addAttribute("user", user);
        return "user/save";
    }
}
