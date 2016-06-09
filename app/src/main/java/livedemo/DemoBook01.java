package livedemo;

/**
 * 1) getters, equals/hashCode
 * 2) toString()
 * 3) Extra field
 */
public class DemoBook01 {

    private final String title;
    private final String author;
    private final int publicationYear;
    private final int pageCount;

    public DemoBook01(String title, String author, int publicationYear, int pageCount) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.pageCount = pageCount;
    }
}
