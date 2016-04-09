package chatty.myself.res_waiterv001.utill;

import org.androidannotations.annotations.EBean;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by dewmal on 12/17/14.
 */
@EBean(scope = EBean.Scope.Singleton)
public class SessionManagement {

    private final Map<String, Object> SESSION = new ConcurrentHashMap<>();

    /**
     * Get Session
     *
     * @return
     */
    public Map<String, Object> getSESSION() {
        return SESSION;
    }
}
