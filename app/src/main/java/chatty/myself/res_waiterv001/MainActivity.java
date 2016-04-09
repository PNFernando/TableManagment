package chatty.myself.res_waiterv001;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;

import org.androidannotations.annotations.EActivity;


@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

    private static int SPLASH_TIME_OUT = 4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isConnected(this)) {
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity.this, LoginPageActivity_.class);
                    startActivity(intent);
                    finish();
                }
            }, SPLASH_TIME_OUT);
        } else {
            new AlertDialog.Builder(this)
                    .setTitle("Warning")
                    .setMessage("No Internet Connection Avalable")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();
        }
    }

    public final static boolean isConnected(Context context) {
        final ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        final NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }


}
