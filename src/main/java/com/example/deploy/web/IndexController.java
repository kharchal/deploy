package com.example.deploy.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class IndexController {

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        model.addAttribute("msg", LocalDateTime.now());
        return "index";
    }
}
