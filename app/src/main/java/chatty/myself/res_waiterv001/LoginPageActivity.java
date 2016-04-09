package chatty.myself.res_waiterv001;


import android.app.Activity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.rest.RestService;

import chatty.myself.res_waiterv001.model.User;
import chatty.myself.res_waiterv001.service.UserService;
import chatty.myself.res_waiterv001.utill.SessionManagement;

/**
 * Created by Pramoda Fernando on 4/12/2015.
 */

@EActivity(R.layout.activity_login)
public class LoginPageActivity extends Activity {

    static LoginPageActivity loginPageActivity;

    @ViewById
    EditText etUsername;


    @ViewById
    EditText etPassword;

    @RestService
    UserService userService;


    @Bean
    SessionManagement sessionManagement;


    @AfterViews
    void initView() {
        loginPageActivity = this;
    }


    @Click
    void btLogin(View view) {
        String email = etUsername.getText().toString();
        String password = etPassword.getText().toString();
     //   System.out.println("Password :" + password);
       // login(email, password);

        Intent intent = new Intent(this, TableViewActivity_.class);
        startActivity(intent);
    }


    @Background
    void login(String email, String password) {
        User user = userService.login(email, password);
        Log.v("USER ID", user.getUserId()+"");




        if (user != null) {

//            User data = (User) user;

            sessionManagement.getSESSION().put("login_user_id",user.getUserId());
            Intent intent = new Intent(this, LoadingPageActivity_.class);
            startActivity(intent);
        } else {
//            new AlertDialog.Builder(this)
//                    .setTitle("Warning")
//                    .setMessage("Wrong Email or Password")
//                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
//                        public void onClick(DialogInterface dialog, int which) {
//                            finish();
//                        }
//                    })
//                    .setIcon(android.R.drawable.ic_dialog_alert)
//                    .show();
        }

        // sessionManagement.getSESSION().put("new_user_id",responseMessage.getData().toString());

        //showMessage(responseMessage.getData().toString());

    }

    @Click
    void btSignin(View view) {
        Intent intent = new Intent(this, SignInPageActivity_.class);
        startActivity(intent);
    }


}
