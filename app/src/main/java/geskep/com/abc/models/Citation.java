package geskep.com.abc.models;

/**
 * Created by User on 10/6/2017.
 */

public class Citation {

    private int mNumber;
    private String mCitation;

    public Citation(int number, String citation){
        mNumber = number;
        mCitation = citation;
    }

    public int getNumber() {
        return mNumber;
    }

    public void setmNumber(int number) {
        this.mNumber = number;
    }

    public String getCitation() {
        return mCitation;
    }

    public void setCitation(String citation) {
        this.mCitation = citation;
    }

    @Override
    public String toString() {
        return "Citation{" +
                "Number=" + mNumber +
                ", Citation='" + mCitation + '\'' +
                '}';
    }
}
