package com.abprojects.ministorymaker.controllers;

import com.abprojects.ministorymaker.models.RandomStory;
import com.abprojects.ministorymaker.models.Story;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("makeastory")
public class MakeStoryController {

    @GetMapping
    public String renderMakeAStoryForm(Model model) {
        model.addAttribute("title", "Make a Story");

        Story story = new Story();
        story.setRandomStory(RandomStory.createRandomStory("Beneath the infinite green canopy, life glistened and buzzed.", "What a beautiful day.", "The visitors began to whisper."));

        model.addAttribute("story", story);
        return "makeastory";
    }
}
