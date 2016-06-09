package livedemo;

import com.google.auto.value.AutoValue;

/**
 * 1) Parcelable
 * 2) build.gradle
 * 3) $$$
 */

@AutoValue
public abstract class DemoBook04 {

    public static DemoBook04 create(String title, String author, int pubYer, int pageCount) {
        return new AutoValue_DemoBook04(title, author, pubYer, pageCount);
    }

    abstract String title();

    abstract String author();

    abstract int pubYear();

    abstract int pageCount();

}
