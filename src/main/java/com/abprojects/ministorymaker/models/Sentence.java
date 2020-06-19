package com.abprojects.ministorymaker.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Sentence extends AbstractEntity {

    private String author;
	private String writtenWork;
	private String text;

	@ManyToMany(mappedBy = "randomSentences")
    // mappedBy ensures Hibernate populates the storiesUsedIn collection of a given Sentence
    // with every RandomStory that has that sentence in its randomSentences collection.
	private List<RandomStory> storiesUsedIn = new ArrayList<>();

	private int publicationYear;

	public Sentence() {}

    public Sentence(String text, String author, String writtenWork, int publicationYear) {
        this.text = text;
	    this.author = author;
        this.writtenWork = writtenWork;
        this.publicationYear = publicationYear;
    }

    public Sentence(String text) {
	    this(text, "author", "written work", 2020);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public List<RandomStory> getStoriesUsedIn() {
        return storiesUsedIn;
    }

    public void setStoriesUsedIn(List<RandomStory> storiesUsedIn) {
        this.storiesUsedIn = storiesUsedIn;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
	    return this.text;
    }
}
