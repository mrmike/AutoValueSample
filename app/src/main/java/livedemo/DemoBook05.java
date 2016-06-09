package livedemo;

import com.google.auto.value.AutoValue;

/**
 * 1) type adapter(gson)
 * 2) test
 */

@AutoValue
public abstract class DemoBook05 {

    abstract String title();

    abstract String author();

    abstract int pubYear();
}
