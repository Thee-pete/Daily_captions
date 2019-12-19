package com.apps.pete.photocaptions;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeintent = new Intent(splashscreen.this, FirstpageActivity.class);
                startActivity(homeintent);
                finish();
            }

        },3000);
    }
}
