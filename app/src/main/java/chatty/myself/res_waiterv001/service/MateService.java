package chatty.myself.res_waiterv001.service;

import org.androidannotations.annotations.rest.Accept;
import org.androidannotations.annotations.rest.Post;
import org.androidannotations.annotations.rest.Rest;
import org.androidannotations.api.rest.MediaType;
import org.androidannotations.api.rest.RestClientRootUrl;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import chatty.myself.res_waiterv001.model.ResponseMessage;
import chatty.myself.res_waiterv001.model.Mate;
import chatty.myself.res_waiterv001.service.converter.Mate2HttpMessageConverter;

/**
 * Created by Pramoda Fernando on 4/19/2015.
 */

@Rest(rootUrl = "http://192.168.1.2:8080/web/chatty/mate/",converters = {MappingJackson2HttpMessageConverter.class,Mate2HttpMessageConverter.class})

public interface MateService extends RestClientRootUrl {

    @Post(value = "save")
    @Accept(MediaType.APPLICATION_JSON)
    ResponseMessage saveMate(Mate Mate);



}
