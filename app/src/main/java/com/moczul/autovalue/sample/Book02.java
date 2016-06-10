package com.moczul.autovalue.sample;

import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Book02 {

    public static Book02 create(String title, @Nullable String author, int pubYear, int pageCount) {
        return new AutoValue_Book02(title, author, pubYear, pageCount);
    }

    abstract String title();

    @Nullable
    abstract String author();

    abstract int pubYear();

    abstract int pageCount();

}
