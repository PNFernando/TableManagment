package chatty.myself.res_waiterv001.model;

import java.sql.Timestamp;

/**
 * Created by Pramoda Fernando on 4/19/2015.
 */
public class Gallary {
    private long gallaryId;
    private long userId;
    private String img;
    private String comment;
    private Timestamp dateTime;

    public Gallary() {
    }

    public Gallary(long gallaryId, long userId, String img, String comment, Timestamp dateTime) {
        this.gallaryId = gallaryId;
        this.userId = userId;
        this.img = img;
        this.comment = comment;
        this.dateTime = dateTime;
    }

    public long getGallaryId() {
        return gallaryId;
    }

    public void setGallaryId(long gallaryId) {
        this.gallaryId = gallaryId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Gallary{" +
                "gallaryId=" + gallaryId +
                ", userId=" + userId +
                ", img='" + img + '\'' +
                ", comment='" + comment + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
