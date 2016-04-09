package chatty.myself.res_waiterv001.model;

import java.sql.Timestamp;

/**
 * Created by Pramoda Fernando on 4/16/2015.
 */
public class Alert {
    private long alertId;
    private long alertOwnerId;
    private long toWhomeId;
    private long suggestUserId;
    private Timestamp dateTime;
    private String status;
    private String type;

    public Alert() {
    }

    public Alert(long alertId, long alertOwnerId, long toWhomeId, long suggestUserId, Timestamp dateTime, String status, String type) {
        this.alertId = alertId;
        this.alertOwnerId = alertOwnerId;
        this.toWhomeId = toWhomeId;
        this.suggestUserId = suggestUserId;
        this.dateTime = dateTime;
        this.status = status;
        this.type = type;
    }

    public long getAlertId() {
        return alertId;
    }

    public void setAlertId(long alertId) {
        this.alertId = alertId;
    }

    public long getAlertOwnerId() {
        return alertOwnerId;
    }

    public void setAlertOwnerId(long alertOwnerId) {
        this.alertOwnerId = alertOwnerId;
    }

    public long getToWhomeId() {
        return toWhomeId;
    }

    public void setToWhomeId(long toWhomeId) {
        this.toWhomeId = toWhomeId;
    }

    public long getSuggestUserId() {
        return suggestUserId;
    }

    public void setSuggestUserId(long suggestUserId) {
        this.suggestUserId = suggestUserId;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
