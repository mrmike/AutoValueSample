package com.moczul.autovalue.sample;

import org.junit.Test;

import java.util.HashSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class Book03Test {

    @Test
    public void bookBuilderTest() {
        final Book03 book = Book03.builder().title("Foo").author("Bar").pubYear(2014).pageCount(250).build();

        assertEquals("Foo", book.title());
        assertEquals("Bar", book.author());
        assertEquals(2014, book.pubYear());
        assertEquals(250, book.pageCount());
    }

    @Test
    public void equalsTest() {
        final Book03 book1 = Book03.builder().title("Foo").author("Bar").pubYear(2014).pageCount(250).build();
        final Book03 book2 = Book03.builder().title("Foo").author("Bar").pubYear(2014).pageCount(250).build();

        assertEquals(book1, book2);
    }

    @Test
    public void notEqualsTest() {
        final Book03 book1 = Book03.builder().title("Foo").author("Bar").pubYear(2014).pageCount(250).build();
        final Book03 book2 = Book03.builder().title("Abc").author("Xyz").pubYear(2016).pageCount(500).build();

        assertNotEquals(book1, book2);
    }

    @Test(expected = IllegalStateException.class)
    public void builderNullCheckTest() {
        Book03.builder().title(null).author("Bar").pubYear(2014).pageCount(250).build();
    }

    @Test
    public void nullableTest() {
        final Book03 book = Book03.builder().title("Foo").author(null).pubYear(2014).pageCount(250).build();

        assertNull(book.author());
    }

    @Test
    public void hashSetTest() {
        final Book03 book1 = Book03.builder().title("Foo").author("Bar").pubYear(2014).pageCount(250).build();
        final Book03 book2 = Book03.builder().title("Foo").author("Bar").pubYear(2014).pageCount(250).build();
        final Book03 book3 = Book03.builder().title("Foo").author("Bar").pubYear(2014).pageCount(250).build();

        final HashSet<Book03> set = new HashSet<>();
        set.add(book1);
        set.add(book2);
        set.add(book3);

        assertThat(set.size(), is(1));
    }

}