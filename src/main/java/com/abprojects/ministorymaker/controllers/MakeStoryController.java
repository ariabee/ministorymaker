package com.abprojects.ministorymaker.controllers;

import com.abprojects.ministorymaker.models.RandomStory;
import com.abprojects.ministorymaker.models.Story;
import com.abprojects.ministorymaker.models.data.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("makeastory")
public class MakeStoryController {

    @Autowired
    private StoryRepository storyRepository;

    @GetMapping
    public String renderMakeAStoryForm(Model model) {
        model.addAttribute("title", "Make a Story");

        Story story = new Story();
        story.setRandomStory(RandomStory.createRandomStory("Beneath the infinite green canopy, life glistened and buzzed.", "What a beautiful day.", "The visitors began to whisper."));

        model.addAttribute("story", story);
        return "makeastory";
    }

    @PostMapping
    public String renderMakeAStoryForm(@ModelAttribute @Valid Story newStory, Errors errors, Model model) {
        // if errors, redirect user to story form
        if(errors.hasErrors()) {
            model.addAttribute("title", "Make a Story");
            return "makeastory";
        }
        storyRepository.save(newStory);
        return "redirect:";
    }
}
