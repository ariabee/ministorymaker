package com.abprojects.ministorymaker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("makeastory")
public class MakeStoryController {

    @GetMapping
    public String renderMakeAStoryForm(Model model) {
        model.addAttribute("title", "Make a Story");
        return "makeastory";
    }
}
