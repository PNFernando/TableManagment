package chatty.myself.res_waiterv001.model.showmodel;



/**
 * Created by pramoda-nf on 4/29/15.
 */
public class ShowAlert {

    private Long suggestId;
    private String name;
    private String url;
    private String tagline;
    private String bywhome;
    private String age;
    private String time;

    public ShowAlert() {
    }

    public ShowAlert(Long suggestId, String name, String url, String tagline, String bywhome, String age, String time) {
        this.suggestId = suggestId;
        this.name = name;
        this.url = url;
        this.tagline = tagline;
        this.bywhome = bywhome;
        this.age = age;
        this.time = time;
    }

    public Long getSuggestId() {
        return suggestId;
    }

    public void setSuggestId(Long suggestId) {
        this.suggestId = suggestId;
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

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getBywhome() {
        return bywhome;
    }

    public void setBywhome(String bywhome) {
        this.bywhome = bywhome;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
