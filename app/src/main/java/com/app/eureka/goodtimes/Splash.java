package com.app.eureka.goodtimes;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import su.levenetc.android.textsurface.TextSurface;


public class Splash extends AppCompatActivity {

    private TextSurface textSurface;
    private Button b;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Log.d("hello", "splash");
        textSurface = (TextSurface) findViewById(R.id.text_surface);
        b = (Button)findViewById(R.id.loginb);

        textSurface.postDelayed(new Runnable() {
            @Override
            public void run() {
                show();
            }
        }, 1000);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                b.setVisibility(View.VISIBLE);
            }
        }, 9000);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Splash.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

    private void show() {
        textSurface.reset();
        SplashText.play(textSurface, getAssets());
    }

}