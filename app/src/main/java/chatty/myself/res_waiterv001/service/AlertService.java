package chatty.myself.res_waiterv001.service;

import org.androidannotations.annotations.rest.Accept;
import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Post;
import org.androidannotations.annotations.rest.Rest;
import org.androidannotations.api.rest.MediaType;
import org.androidannotations.api.rest.RestClientRootUrl;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.List;

import chatty.myself.res_waiterv001.model.ResponseMessage;
import chatty.myself.res_waiterv001.model.Alert;
import chatty.myself.res_waiterv001.model.showmodel.ShowAlert;
import chatty.myself.res_waiterv001.service.converter.Alert2HttpMessageConverter;

/**
 * Created by Pramoda Fernando on 4/19/2015.
 */

@Rest(rootUrl = "http://192.168.1.2:8080/web/chatty/alert/",converters = {MappingJackson2HttpMessageConverter.class,Alert2HttpMessageConverter.class})

public interface AlertService extends RestClientRootUrl {

    @Post(value = "save")
    @Accept(MediaType.APPLICATION_JSON)
    ResponseMessage saveAlert(Alert Alert);

//    chatty/alert/get_all_alert_details_by_Id?userId=1430241572027


    @Get(value = "getShowAlertByUserId?userId={user}")
    @Accept(MediaType.APPLICATION_JSON)
    List<ShowAlert> getShowAlertByUserId(Long user);


}
