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

	@ManyToMany(mappedBy = "randomSentences")
    // mappedBy ensures Hibernate populates the storiesUsedIn collection of a given Sentence
    // with every RandomStory that has that sentence in its randomSentences collection.
	private List<RandomStory> storiesUsedIn = new ArrayList<>();

	private int publicationYear;

	public Sentence() {}

    public Sentence(String author, String writtenWork, int publicationYear) {
        this.author = author;
        this.writtenWork = writtenWork;
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
}
