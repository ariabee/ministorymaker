package com.abprojects.ministorymaker.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class StorySentence extends AbstractEntity {

    private String author;

	private String writtenWork;

    @ManyToMany(mappedBy = "randomStory")
	private List<Story> storiesUsedIn = new ArrayList<>();

	private int publicationYear;

	public StorySentence() {}

    public StorySentence(String author, String writtenWork, List<Story> storiesUsedIn, int publicationYear) {
        this.author = author;
        this.writtenWork = writtenWork;
        this.storiesUsedIn = storiesUsedIn;
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getWrittenWork() {
        return writtenWork;
    }

    public void setWrittenWork(String writtenWork) {
        this.writtenWork = writtenWork;
    }

    public List<Story> getStoriesUsedIn() {
        return storiesUsedIn;
    }

    public void setStoriesUsedIn(List<Story> storiesUsedIn) {
        this.storiesUsedIn = storiesUsedIn;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
