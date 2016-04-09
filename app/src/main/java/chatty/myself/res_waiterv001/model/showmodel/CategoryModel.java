package chatty.myself.res_waiterv001.model.showmodel;

/**
 * Created by pramoda-nf on 3/30/16.
 */
public class CategoryModel {

    private String name;
    private String url;


    public CategoryModel(String name, String url) {
        this.name = name;
        this.url = url;
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
}
