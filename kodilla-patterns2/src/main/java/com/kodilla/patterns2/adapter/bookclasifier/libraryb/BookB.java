package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

public class BookB {
    private final String author;
    private final String title;
    private final int yearPublication;

    public BookB(String author, String title, int yearPublication) {
        this.author = author;
        this.title = title;
        this.yearPublication = yearPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublication() {
        return yearPublication;
    }
}
