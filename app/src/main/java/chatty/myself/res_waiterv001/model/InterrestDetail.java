package chatty.myself.res_waiterv001.model;

/**
 * Created by Pramoda Fernando on 4/19/2015.
 */
public class InterrestDetail {

    private long interId;
    private long userId;
    private String gender;
    private int firstage;
    private int secondage;
    private String country1;
    private String country2;
    private String country3;

    public InterrestDetail() {
    }

    public InterrestDetail(long interId, long userId, String gender, int firstage, int secondage, String country1, String country2, String country3) {
        this.interId = interId;
        this.userId = userId;
        this.gender = gender;
        this.firstage = firstage;
        this.secondage = secondage;
        this.country1 = country1;
        this.country2 = country2;
        this.country3 = country3;
    }

    public long getInterId() {
        return interId;
    }

    public void setInterId(long interId) {
        this.interId = interId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getFirstage() {
        return firstage;
    }

    public void setFirstage(int firstage) {
        this.firstage = firstage;
    }

    public int getSecondage() {
        return secondage;
    }

    public void setSecondage(int secondage) {
        this.secondage = secondage;
    }

    public String getCountry1() {
        return country1;
    }

    public void setCountry1(String country1) {
        this.country1 = country1;
    }

    public String getCountry2() {
        return country2;
    }

    public void setCountry2(String country2) {
        this.country2 = country2;
    }

    public String getCountry3() {
        return country3;
    }

    public void setCountry3(String country3) {
        this.country3 = country3;
    }

    @Override
    public String toString() {
        return "InterrestDetail{" +
                "interId=" + interId +
                ", userId=" + userId +
                ", gender='" + gender + '\'' +
                ", firstage=" + firstage +
                ", secondage=" + secondage +
                ", country1='" + country1 + '\'' +
                ", country2='" + country2 + '\'' +
                ", country3='" + country3 + '\'' +
                '}';
    }
}
