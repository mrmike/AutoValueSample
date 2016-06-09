package livedemo;

import com.google.auto.value.AutoValue;

/**
 * 1) Builder pattern
 * 2) Default value
 * 3) Nullable
 * 4) Extra validation
 */


@AutoValue
public abstract class DemoBook03 {

    abstract String title();

    abstract String author();

    abstract int pubYear();

}
