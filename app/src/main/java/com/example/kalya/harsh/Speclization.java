package com.example.kalya.harsh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.system.Os;
import android.view.View;
import android.widget.RelativeLayout;

public class Speclization extends AppCompatActivity implements View.OnClickListener{
    RelativeLayout Physician,Neurology,Osteology,Dentist,Cardiologist,Urologist;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speclization);
        Physician = (RelativeLayout)findViewById(R.id.firstimage);
        Neurology = (RelativeLayout)findViewById(R.id.secondimage);
        Osteology = (RelativeLayout)findViewById(R.id.thirdimage);
        Dentist = (RelativeLayout)findViewById(R.id.fourthimage);
        Cardiologist = (RelativeLayout)findViewById(R.id.fivethimage);
        Urologist = (RelativeLayout)findViewById(R.id.sixthimage);
        Physician.setOnClickListener(this);
        Neurology.setOnClickListener(this);
        Osteology.setOnClickListener(this);
        Dentist.setOnClickListener(this);
        Cardiologist.setOnClickListener(this);
        Urologist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == Physician)
        {
            Intent i = new Intent(Speclization.this,ImagesActivity.class);
            name = "Physician";
            i.putExtra("name",name);
            startActivity(i);
        }
        if (v == Neurology)
        {
            Intent i = new Intent(Speclization.this,ImagesActivity.class);
            name = "Neurology";
            i.putExtra("name",name);
            startActivity(i);
        }
        if (v == Osteology)
        {
            Intent i = new Intent(Speclization.this,ImagesActivity.class);
            name = "Osteology";
            i.putExtra("name",name);
            startActivity(i);
        }
        if (v == Dentist)
        {
            Intent i = new Intent(Speclization.this,ImagesActivity.class);
            name = "Dentist";
            i.putExtra("name",name);
            startActivity(i);
        }
        if (v == Urologist)
        {
            Intent i = new Intent(Speclization.this,ImagesActivity.class);
            name = "Urologist";
            i.putExtra("name",name);
            startActivity(i);
        }
        if (v == Cardiologist)
        {
            Intent i = new Intent(Speclization.this,ImagesActivity.class);
            name = "Cardiologist";
            i.putExtra("name",name);
            startActivity(i);
        }
    }
}
