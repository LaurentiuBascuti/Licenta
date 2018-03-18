package com.dev.lawrence.licenta_poo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Home extends AppCompatActivity implements View.OnClickListener{

    private CardView learnBtn, testBtn, profileBtn, progressBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Definirea cardurilor
        learnBtn = (CardView) findViewById(R.id.learnId);
        testBtn = (CardView) findViewById(R.id.testId);
        profileBtn = (CardView) findViewById(R.id.profileId);
        progressBtn = (CardView) findViewById(R.id.progressId);

        //Adaugarea listenerelor
        learnBtn.setOnClickListener(this);
        testBtn.setOnClickListener(this);
        profileBtn.setOnClickListener(this);
        progressBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId())
        {
            case R.id.learnId : i = new Intent(this, Learning.class);startActivity(i);break;
            case R.id.testId : i = new Intent(this, Tests.class);startActivity(i);break;
            case R.id.profileId : i = new Intent(this, Profile.class);startActivity(i);break;
            case R.id.progressId : i = new Intent(this, Progress.class);startActivity(i);break;
            default:break;
        }
    }
}
