package com.moczul.autovalue.sample;

public class Book01 {

    private final String title;
    private final String author;
    private final int pubYear;
    private final int pageCount;

    public Book01(String title, String author, int pubYear, int pageCount) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPubYear() {
        return pubYear;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book01 book01 = (Book01) o;

        if (pubYear != book01.pubYear) return false;
        if (pageCount != book01.pageCount) return false;
        if (title != null ? !title.equals(book01.title) : book01.title != null) return false;
        return author != null ? author.equals(book01.author) : book01.author == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + pubYear;
        result = 31 * result + pageCount;
        return result;
    }

    @Override
    public String toString() {
        return "Book01{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pubYear=" + pubYear +
                ", pageCount=" + pageCount +
                '}';
    }

}
