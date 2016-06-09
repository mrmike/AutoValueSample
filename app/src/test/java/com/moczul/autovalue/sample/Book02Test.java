package com.moczul.autovalue.sample;

import org.junit.Test;

import java.util.HashSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class Book02Test {

    @Test
    public void bookTest() {
        final Book02 book = Book02.create("Foo", "Bar", 2016, 500);

        assertEquals("Foo", book.title());
        assertEquals("Bar", book.author());
        assertEquals(2016, book.pubYear());
        assertEquals(500, book.pageCount());
    }

    @Test
    public void equalsTest() {
        final Book02 book1 = Book02.create("Foo", "Bar", 2016, 500);
        final Book02 book2 = Book02.create("Foo", "Bar", 2016, 500);

        assertEquals(book1, book2);
    }

    @Test
    public void notEqualsTest() {
        final Book02 book1 = Book02.create("Foo", "Bar", 2016, 500);
        final Book02 book2 = Book02.create("Abc", "Xyz", 2014, 250);

        assertNotEquals(book1, book2);
    }

    @Test
    public void hashSetTest() {
        final Book02 book1 = Book02.create("Foo", "Bar", 2016, 500);
        final Book02 book2 = Book02.create("Foo", "Bar", 2016, 500);
        final Book02 book3 = Book02.create("Foo", "Bar", 2016, 500);

        final HashSet<Book02> set = new HashSet<>();
        set.add(book1);
        set.add(book2);
        set.add(book3);

        assertThat(set.size(), is(1));
    }

    @Test(expected = NullPointerException.class)
    public void nullCheckTest() {
        Book02.create(null, "Bar", 2016, 500);
    }

    @Test
    public void nullableTest() {
        final Book02 book1 = Book02.create("Foo", null, 2016, 500);

        assertNull(book1.author());
    }

}