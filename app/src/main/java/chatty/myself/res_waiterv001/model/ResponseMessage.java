package chatty.myself.res_waiterv001.model;



/**
 * Created by npradeep on 4/9/15.
 */
public class ResponseMessage{

    public static final ResponseMessage SUCCESS = new ResponseMessage("success", "200");
    public static final ResponseMessage WARN = new ResponseMessage("warn", "400");
    public static final ResponseMessage DANGER = new ResponseMessage("danger", "500");

    private String text;
    private String type;

    private Object data;

    public ResponseMessage() {
    }

    public ResponseMessage(String text, String type) {
        this.text = text;
        this.type = type;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }




}
