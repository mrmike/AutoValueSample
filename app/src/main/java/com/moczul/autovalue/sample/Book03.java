package com.moczul.autovalue.sample;


import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Book03 {

    abstract String title();

    @Nullable
    abstract String author();

    abstract int pubYear();

    abstract int pageCount();

    static Builder builder() {
        return new AutoValue_Book03.Builder();
    }

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder title(String title);

        abstract Builder author(@Nullable String author);

        abstract Builder pubYear(int pubYear);

        abstract Builder pageCount(int pageCount);

        abstract Book03 build();
    }

}
