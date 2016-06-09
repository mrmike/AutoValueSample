package livedemo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ryanharter.auto.value.gson.AutoValueGsonTypeAdapterFactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoBook05Test {

    @Test
    public void testFromJson() {
        final String json = "{\"title\": \"Foo\", \"author\": \"Bar\", \"year\": 2015}";

        final Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(new AutoValueGsonTypeAdapterFactory())
                .create();

        final DemoBook05 book = gson.fromJson(json, DemoBook05.class);

        assertEquals("Foo", book.title());
        assertEquals("Bar", book.author());
        assertEquals(2015, book.pubYear());
    }

}