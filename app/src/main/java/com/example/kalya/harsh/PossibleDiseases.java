package com.example.kalya.harsh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class PossibleDiseases extends AppCompatActivity {
    ArrayList<String> symptoms1 = new ArrayList<>();
    ArrayList<String> diseases =  new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_possible_diseases);
        symptoms1 = (ArrayList<String>)getIntent().getSerializableExtra("message");
        if (symptoms1.get(0).equals("cold"))
        {
            //diseases.add()
        }
        if (symptoms1.get(0).equals("fever"))
        {

        }
        if (symptoms1.get(0).equals("heartattack"))
        {

        }if (symptoms1.get(0).equals("stroke"))
        {

        }if (symptoms1.get(0).equals("reproductive"))
        {

        }if (symptoms1.get(0).equals("breast"))
        {

        }if (symptoms1.get(0).equals("lung"))
        {

        }if (symptoms1.get(0).equals("digestive"))
        {

        }if (symptoms1.get(0).equals("skin"))
        {

        }if (symptoms1.get(0).equals("muscle"))
        {

        }if (symptoms1.get(0).equals("headache"))
        {

        }if (symptoms1.get(0).equals("weight"))
        {

        }
    }
}
