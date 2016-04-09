package chatty.myself.res_waiterv001.service.converter;


import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.io.IOException;

import chatty.myself.res_waiterv001.model.Chatty;


/**
 * Created by dewmal on 12/19/14.
 */
public class Chatty2HttpMessageConverter extends MappingJackson2HttpMessageConverter {
    //
    private static final String TAG = Chatty2HttpMessageConverter.class.getName();

    @Override
    protected boolean supports(Class<?> clazz) {
        return Chatty.class.equals(clazz);
    }

    @Override
    protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return super.readInternal(clazz, inputMessage);
    }

}
