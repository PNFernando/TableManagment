package chatty.myself.res_waiterv001.model.showmodel;

/**
 * Created by pramoda-nf on 4/29/15.
 */
public class EditOrder {

    private String id;
    private String name;
    private String type;
    private String qty;


    public EditOrder() {
    }

    public EditOrder(String id, String name, String type, String qty) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.qty = qty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }
}
