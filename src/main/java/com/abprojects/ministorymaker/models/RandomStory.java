package com.abprojects.ministorymaker.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RandomStory extends AbstractEntity {

    @ManyToMany
    private List<Sentence> randomSentences = new ArrayList<>();

    public RandomStory() {};

    public RandomStory(List<Sentence> sentences) {
        this.randomSentences = sentences;
    }

    public List<Sentence> getRandomSentences() {
        return randomSentences;
    }

    public void setRandomSentences(ArrayList<Sentence> randomSentences) {
        this.randomSentences = randomSentences;
    }

}
