package com.abprojects.ministorymaker.models;

import com.abprojects.ministorymaker.models.*;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Story extends AbstractEntity {

    @ManyToOne // many Stories for each User
    private User maker;

    @ManyToMany
	private List<StorySentence> randomStory = new ArrayList<>();

    private String newSentence;

	private int rating;

	private String title = "A Ravishing Random Story";

	public Story() {}

	public Story(List<StorySentence> randomStory, String newSentence, String title, int rating) {
	    this.randomStory = randomStory;
	    this.newSentence = newSentence;
	    this.title = title;
	    this.rating = rating;
    }

    public User getMaker() {
        return maker;
    }

    public void setMaker(User maker) {
        this.maker = maker;
    }

    public List<StorySentence> getRandomStory() {
        return randomStory;
    }

    public void setRandomStory(List<StorySentence> randomStory) {
        this.randomStory = randomStory;
    }

    public String getNewSentence() {
        return newSentence;
    }

    public void setNewSentence(String newSentence) {
        this.newSentence = newSentence;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
