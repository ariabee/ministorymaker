package com.abprojects.ministorymaker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("title", "Random Story Maker");
        return "index";
    }

    @GetMapping("makeastory")
    public String renderMakeAStoryForm(Model model) {
        model.addAttribute("title", "Make a Story");
        return "makeastory";
    }
}
