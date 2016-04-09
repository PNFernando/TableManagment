package chatty.myself.res_waiterv001.service;

import org.androidannotations.annotations.rest.Accept;
import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Post;
import org.androidannotations.annotations.rest.Rest;
import org.androidannotations.api.rest.MediaType;
import org.androidannotations.api.rest.RestClientRootUrl;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import chatty.myself.res_waiterv001.model.ResponseMessage;
import chatty.myself.res_waiterv001.model.User;
import chatty.myself.res_waiterv001.service.converter.User2HttpMessageConverter;

/**
 * Created by Pramoda Fernando on 4/19/2015.
 */

@Rest(rootUrl = "http://192.168.1.2:8080/web/chatty/user/",converters = {MappingJackson2HttpMessageConverter.class,User2HttpMessageConverter.class})

public interface UserService extends RestClientRootUrl {

    @Post(value = "save")
    @Accept(MediaType.APPLICATION_JSON)
    ResponseMessage saveUser(User user);

   // http://192.168.1.101:8080/web/chatty/user/login?username=test@gmail.com&password=123

    @Post(value = "login?username={email}&password={password}")
    @Accept(MediaType.APPLICATION_JSON)
    User login(String email,String password);

//    get_all_user_details_by_userId?userId=1430241572027

    @Get(value = "get_all_user_details_by_userId?userId={user_Id}")
    @Accept(MediaType.APPLICATION_JSON)
    User getUserDetailsByUserId(Long user_Id);


}
