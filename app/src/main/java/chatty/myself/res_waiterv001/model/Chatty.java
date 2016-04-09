package chatty.myself.res_waiterv001.model;

import java.sql.Timestamp;

/**
 *
 * @author manish.s
 *
 */

public class Chatty {
    private long userId;
    private long chattyId;
    private Timestamp addDateTime;


    public Chatty() {
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getChattyId() {
        return chattyId;
    }

    public void setChattyId(long chattyId) {
        this.chattyId = chattyId;
    }

    public Timestamp getAddDateTime() {
        return addDateTime;
    }

    public void setAddDateTime(Timestamp addDateTime) {
        this.addDateTime = addDateTime;
    }
}