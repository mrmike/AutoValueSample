package com.moczul.autovalue.sample;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

@AutoValue
public abstract class Book05 {

    public static TypeAdapter<Book05> typeAdapter(Gson gson) {
        return new AutoValue_Book05.GsonTypeAdapter(gson);
    }

    public static Book05 create(String title, String author, int pubYear) {
        return new AutoValue_Book05(title, author, pubYear);
    }

    abstract String title();

    abstract String author();

    @SerializedName("year")
    abstract int pubYear();
}
