package com.example.greetingapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping("/") // Обрабатываем корневой '/' URL
    public String greeting(Model model) {
        model.addAttribute("message", "Привет, пользователь!");
        return "greeting"; // Возвращаем имя шаблона (greeting.html)
    }
}
