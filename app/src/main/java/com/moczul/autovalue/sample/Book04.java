package com.moczul.autovalue.sample;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Book04 implements Parcelable {

    public static Book04 create(String title, String author, int pubYer, int pageCount) {
        return new AutoValue_Book04(title, author, pubYer, pageCount);
    }

    abstract String title();

    abstract String author();

    abstract int pubYear();

    abstract int pageCount();

}