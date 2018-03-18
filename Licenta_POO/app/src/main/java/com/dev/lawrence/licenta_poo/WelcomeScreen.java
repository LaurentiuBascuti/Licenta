package com.dev.lawrence.licenta_poo;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class WelcomeScreen extends AppCompatActivity {

    private TextView tv;
    private ImageView elearning,boi,book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        //instantierea textului si celor 3 imagini din WelcomsScreen
        tv = (TextView) findViewById(R.id.txt);
        elearning = (ImageView) findViewById(R.id.elearningImg);
        boi = (ImageView) findViewById(R.id.boiImg);
        book = (ImageView) findViewById(R.id.bookImg);

        //instantierea animatiei
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.tranzitie);
        tv.startAnimation(anim);
        elearning.startAnimation(anim);
        boi.startAnimation(anim);
        book.startAnimation(anim);

        //crearea efectului de fade in si trecerea dintre Welcome screen catre Home
        final Intent i = new Intent(this,Home.class);
        Thread timer = new Thread(){
            public void run () {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };

        timer.start();
    }
}
