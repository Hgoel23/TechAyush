package com.example.kalya.harsh;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class Home extends AppCompatActivity implements View.OnClickListener{
    private FirebaseAuth mAuth;
    CardView AboutUs,NewsFeed,BookAppointment,Knowdiseases;
    Button SignOut;
    String child,child1;
    int count;
    ArrayList<String> mUsername;
    private ProgressDialog progressDialog;
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mAuth = FirebaseAuth.getInstance();
        AboutUs = (CardView)findViewById(R.id.AboutUs);
        NewsFeed = (CardView)findViewById(R.id.NewsFeed);
        Knowdiseases = (CardView)findViewById(R.id.knowdiseases);
        BookAppointment = (CardView)findViewById(R.id.BookAppointment);
        SignOut = (Button)findViewById(R.id.buttonSignOut);
        AboutUs.setOnClickListener(this);
        NewsFeed.setOnClickListener(this);
        Knowdiseases.setOnClickListener(this);
        BookAppointment.setOnClickListener(this);
        SignOut.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == AboutUs)
        {
            Intent i = new Intent(this,AboutUs.class);
            startActivity(i);

        }else if (v == NewsFeed)
        {
            Intent i = new Intent(this,ImagesActivityforEvents.class);
            startActivity(i);
        }else if (v == Knowdiseases)
        {
            Intent i = new Intent(this,KnowDiseases.class);
            startActivity(i);
        }else if (v == BookAppointment)
        {
            Intent i = new Intent(this,Speclization.class);
            startActivity(i);
        }else if (v == SignOut)
        {
            mAuth.signOut();
            startActivity(new Intent(this,MainActivity.class));
            finish();
        }
    }
}
