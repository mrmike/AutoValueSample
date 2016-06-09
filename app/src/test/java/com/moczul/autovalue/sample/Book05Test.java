package com.moczul.autovalue.sample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ryanharter.auto.value.gson.AutoValueGsonTypeAdapterFactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Book05Test {

    private static final String JSON = "{\"title\":\"Foo\",\"author\":\"Bar\",\"year\":2015}";

    @Test
    public void testFromJson() {
        final Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(new AutoValueGsonTypeAdapterFactory())
                .create();

        final Book05 book = gson.fromJson(JSON, Book05.class);

        assertEquals("Foo", book.title());
        assertEquals("Bar", book.author());
        assertEquals(2015, book.pubYear());
    }

    @Test
    public void testToJson() {
        final Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(new AutoValueGsonTypeAdapterFactory())
                .create();

        final Book05 book = Book05.create("Foo", "Bar", 2015);
        final String toJson = gson.toJson(book);

        assertEquals(JSON, toJson);
    }

}