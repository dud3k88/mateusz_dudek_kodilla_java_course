package com.kodilla.testing.library;

import java.util.Objects;

public class Book {

    private String title;
    private String autor;
    private int publicationYear;

    public Book(String title, String autor, int publicationYear) {
        this.title = title;
        this.autor = autor;
        this.publicationYear = publicationYear;
    }


    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
                Objects.equals(title, book.title) &&
                Objects.equals(autor, book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, autor, publicationYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
