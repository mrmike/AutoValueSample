package livedemo;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

@AutoValue
public abstract class DemoBook06 implements Parcelable {

    public static TypeAdapter<DemoBook06> typeAdapter(Gson gson) {
        return new AutoValue_DemoBook06.GsonTypeAdapter(gson);
    }

    abstract String title();

    abstract String author();

    @SerializedName("year")
    abstract int pubYear();
}