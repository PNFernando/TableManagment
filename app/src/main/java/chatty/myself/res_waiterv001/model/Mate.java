package chatty.myself.res_waiterv001.model;

import java.sql.Timestamp;

/**
 * Created by Pramoda Fernando on 4/19/2015.
 */
public class Mate {
    private long userId;
    private long mateId;
    private Timestamp addDateTime;

    public Mate() {
    }

    public Mate(long userId, long mateId, Timestamp addDateTime) {
        this.userId = userId;
        this.mateId = mateId;
        this.addDateTime = addDateTime;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getMateId() {
        return mateId;
    }

    public void setMateId(long mateId) {
        this.mateId = mateId;
    }

    public Timestamp getAddDateTime() {
        return addDateTime;
    }

    public void setAddDateTime(Timestamp addDateTime) {
        this.addDateTime = addDateTime;
    }

    @Override
    public String toString() {
        return "Mate{" +
                "userId=" + userId +
                ", mateId=" + mateId +
                ", addDateTime=" + addDateTime +
                '}';
    }
}
