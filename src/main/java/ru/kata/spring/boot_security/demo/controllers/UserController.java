package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller()
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String userPage(Model model, Authentication authentication) {
        model.addAttribute("principal", authentication.getPrincipal());
        return "user/user";
    }
}
