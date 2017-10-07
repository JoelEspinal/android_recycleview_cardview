package geskep.com.abc.models;

import java.util.List;

/**
 * Created by User on 10/6/2017.
 */

public class Book {

    private int mBookVersion;
    public static final int DEFAULT_BOOK_VERSION = 0;

    private String mBookName;
    private List<Citation> mCitations;

    public Book(int bookVersion, String bookName) {
        this.mBookVersion = bookVersion;
        this.mBookName = bookName;
    }

    public Book(int bookVersion, String bookName, List<Citation> citations) {
        this.mBookVersion = bookVersion;
        this.mBookName = bookName;
        this.mCitations = citations;
    }

    public int getBookVersion() {
        return mBookVersion;
    }

    public void setBookVersion(int bookVersion) {
        this.mBookVersion = bookVersion;
    }

    public String getBookName() {
        return mBookName;
    }

    public void setBookName(String bookName) {
        this.mBookName = bookName;
    }

    public List<Citation> getCitations() {
        return mCitations;
    }

    public void setCitations(List<Citation> citations) {
        this.mCitations = citations;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookVersion=" + mBookVersion +
                ", bookName='" + mBookName + '\'' +
                ", citations=" + mCitations +
                '}';
    }
}
