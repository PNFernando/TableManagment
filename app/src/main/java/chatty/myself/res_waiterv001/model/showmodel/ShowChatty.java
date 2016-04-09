package chatty.myself.res_waiterv001.model.showmodel;

/**
 * Created by pramoda-nf on 4/29/15.
 */
public class ShowChatty {

    private String name;
    private String url;
    private String age;
    private Boolean status;

    public ShowChatty() {
    }

    public ShowChatty(String name, String url, String age,Boolean status) {
        this.name = name;
        this.url = url;
        this.age = age;
        this.status = status;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
