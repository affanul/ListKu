package id.listk.listku;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.os.Build.VERSION_CODES.M;

public class home_splash extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_splash);
        new Handler(). postDelayed(new Runnable() {
        @Override
            public void run(){
            Intent homeIntent = new Intent(home_splash.this, MainActivity.class);
            startActivity(homeIntent);
            finish();
        }
        },SPLASH_TIME_OUT);
    }
}
