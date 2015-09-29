package criminalintent.android.bignerdranch.com.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by zihua on 2015/9/29.
 */
public class Crime {

    private UUID mid;

    private String mTitle;

    private Date mDate;

    private boolean mSolved;

    public Crime() {
        this.mid = UUID.randomUUID();
        this.mDate = new Date();
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public UUID getMid() {
        return mid;
    }

    public void setMid(UUID mid) {
        this.mid = mid;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    @Override
    public String toString() {
        return "Crime{" +
                "mid=" + mid +
                ", mTitle='" + mTitle + '\'' +
                '}';
    }
}
