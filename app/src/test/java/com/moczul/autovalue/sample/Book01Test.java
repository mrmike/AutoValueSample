package com.moczul.autovalue.sample01;

import com.moczul.autovalue.sample.Book01;

import org.junit.Test;

import java.util.HashSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

public class Book01Test {

    @Test
    public void bookTest() {
        final Book01 book = new Book01("Foo", "Bar", 2016, 500);

        assertEquals("Foo", book.getTitle());
        assertEquals("Bar", book.getAuthor());
        assertEquals(2016, book.getPubYear());
        assertEquals(500, book.getPageCount());
    }

    @Test
    public void equalsTest() {
        final Book01 book1 = new Book01("Foo", "Bar", 2016, 500);
        final Book01 book2 = new Book01("Foo", "Bar", 2016, 500);

        assertEquals(book1, book2);
    }

    @Test
    public void notEqualsTest() {
        final Book01 book1 = new Book01("Foo", "Bar", 2016, 500);
        final Book01 book2 = new Book01("Abc", "Xyz", 2014, 250);

        assertNotEquals(book1, book2);
    }

    @Test
    public void hashSetTest() {
        final Book01 book1 = new Book01("Foo", "Bar", 2016, 500);
        final Book01 book2 = new Book01("Foo", "Bar", 2016, 500);
        final Book01 book3 = new Book01("Foo", "Bar", 2016, 500);

        final HashSet<Book01> set = new HashSet<>();
        set.add(book1);
        set.add(book2);
        set.add(book3);

        assertThat(set.size(), is(1));
    }

}