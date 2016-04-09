package chatty.myself.res_waiterv001;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.rest.RestService;

import chatty.myself.res_waiterv001.model.ResponseMessage;
import chatty.myself.res_waiterv001.model.User;
import chatty.myself.res_waiterv001.service.UserService;
import chatty.myself.res_waiterv001.utill.SessionManagement;

/**
 * Created by Pramoda Fernando on 4/13/2015.
 */
@EActivity(R.layout.activity_signin)
public class SignInPageActivity extends Activity {
    private static final String[] GENDER = new String[]{"MALE", "FEMALE"};

    @ViewById
    Spinner spinner;

    @ViewById
    EditText txt_username;

    @ViewById
    EditText txt_email;

    @ViewById
    EditText txt_password;

    @ViewById
    EditText txt_confirm_password;

    @RestService
    UserService userService;


    @Bean
    SessionManagement sessionManagement;


    private ArrayAdapter<CharSequence> adapter;


    @AfterViews
    void initView() {
        adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, GENDER);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }


//    @Background
//    void checkPasswordConfim(){
//
//        if (!txt_password.toString().equals(txt_confirm_password.toString())){
//            txt_password.setText("");
//
//        }
//
//    }


    @Click
    void btNext(View view) {

        User user = new User();

        user.setName(txt_username.getText().toString());
        user.setEmail(txt_email.getText().toString());
        user.setPassword(txt_confirm_password.getText().toString());

        user.setGender("Male");
        user.setAge(22);
        user.setAstro("Argo");
        user.setBloodtype("B+");
        user.setBodyshape("fat");

        user.setCoverpicurl("dgfdgg");
        user.setDob("1992-11-20");
        user.setHeight("168 cm");
        user.setIntroduction("vdfvfdvg");

        user.setNationality("fvg");
        user.setWeight("80 kg");
        user.setPropicurl("sgfgdfg");
        user.setReligion("vfdv");

        user.setStatus("fvdgv");
        user.setMaritalstatus("Single");

        saveUser(user);

//
//        Intent intent = new Intent(this, InterestDetailPageActivity_.class);
//        startActivity(intent);
//        finish();

    }


    @Background
    void saveUser(User user){
        ResponseMessage responseMessage = userService.saveUser(user);
        Log.v("USER ID",responseMessage.getData().toString());

        sessionManagement.getSESSION().put("login_user_id",responseMessage.getData().toString());

        showMessage(responseMessage.getData().toString());
    }


    @UiThread
    void showMessage(String text) {
        Log.v("THREAD WORKING SIGN IN", text);
        Toast.makeText(this, text, Toast.LENGTH_SHORT);
    }


}
