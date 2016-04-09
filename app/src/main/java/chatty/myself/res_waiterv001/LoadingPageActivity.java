package chatty.myself.res_waiterv001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import android.os.Handler;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by Pramoda Fernando on 4/13/2015.
 */
@EActivity(R.layout.activity_loading)
public class LoadingPageActivity extends Activity {

    @ViewById
    ProgressBar progressBar;

    private static int SPLASH_TIME_OUT = 3000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//
//        new Handler().postDelayed(new Runnable() {
//
//            @Override
//            public void run() {
//                Intent intent = new Intent(LoadingPageActivity.this, LivingPageActivity_.class);
//                startActivity(intent);
//                finish();
//            }
//        }, SPLASH_TIME_OUT);
    }





    }
