package com.abprojects.ministorymaker.models;

import javax.lang.model.type.ArrayType;
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

    public static RandomStory createRandomStory(String s1, String s2, String s3) {
        List<Sentence> sentences = new ArrayList<>();
        sentences.add(new Sentence(s1,"author", "written work", 2020));
        sentences.add(new Sentence(s2,"author", "written work", 2020));
        sentences.add(new Sentence(s3,"author", "written work", 2020));

        RandomStory random = new RandomStory(sentences);

        return random;
    }
}
