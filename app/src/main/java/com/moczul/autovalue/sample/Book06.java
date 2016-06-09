package com.moczul.autovalue.sample;


import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

/**
 * Combined Parcelable and Gson extensions
 * See how AutoValue_Book06 looks now
 */
@AutoValue
public abstract class Book06 implements Parcelable {

    public static TypeAdapter<Book06> typeAdapter(Gson gson) {
        return new AutoValue_Book06.GsonTypeAdapter(gson);
    }

    abstract String title();

    abstract String author();

    @SerializedName("year")
    abstract int pubYear();
}