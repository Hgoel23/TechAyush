package com.example.kalya.harsh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class Put extends AppCompatActivity implements View.OnClickListener{
    CheckBox cold,fever,heartattack,stroke,reproductive,breast,lung,digestive,skin,muscle,headache,weight;
    EditText editText;
    RelativeLayout rl;
    ArrayList<String> symptoms = new ArrayList<>();
    int cold1=0,fever1=0,heartattack1=0,stroke1=0,reproductive1=0,breast1=0,lung1=0,digestive1=0,skin1=0,muscle1=0,headache1=0,weight1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_put);
        rl = (RelativeLayout)findViewById(R.id.ok);
        editText = (EditText)findViewById(R.id.textfield123);
        cold = (CheckBox) findViewById(R.id.cold);
        fever = (CheckBox) findViewById(R.id.fever);
        heartattack = (CheckBox) findViewById(R.id.HeartAttack);
        stroke = (CheckBox) findViewById(R.id.stroke);
        reproductive = (CheckBox) findViewById(R.id.reproductivehealth);
        breast = (CheckBox) findViewById(R.id.breastproblems);
        lung = (CheckBox) findViewById(R.id.lungproblems);
        digestive = (CheckBox) findViewById(R.id.digestiveproblems);
        skin = (CheckBox) findViewById(R.id.skinproblems);
        muscle = (CheckBox) findViewById(R.id.muscleorjoint);
        headache = (CheckBox) findViewById(R.id.headacheproblems);
        weight = (CheckBox) findViewById(R.id.weightproblems);
        rl.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == rl)
        {
            if (cold.isChecked()) {
                symptoms.add("cold");
                cold1 = 1;
            }
            if (fever.isChecked()) {
                symptoms.add("fever");
                fever1 = 1;
            }
            if (heartattack.isChecked()) {
                symptoms.add("heartattack");
                heartattack1 = 1;
            }
            if (stroke.isChecked()) {
                symptoms.add("stroke");
                stroke1 = 1;
            }
            if (reproductive.isChecked()) {
                symptoms.add("reproductive");
                reproductive1 = 1;
            }
            if (breast.isChecked()) {
                symptoms.add("breast");
                breast1 = 1;
            }
            if (lung.isChecked()) {
                symptoms.add("lung");
                lung1 = 1;
            }
            if (digestive.isChecked()) {
                symptoms.add("digestive");
                digestive1 = 1;
            }
            if (skin.isChecked())
            {
                symptoms.add("skin");
                skin1 = 1;
            }
            if (muscle.isChecked())
            {
                symptoms.add("muscle");
                muscle1 = 1;
            }
            if (headache.isChecked())
            {
                symptoms.add("headache");
                headache1 = 1;
            }
            if (weight.isChecked()) {
                symptoms.add("weight");
                weight1 = 1;
            }
            if (editText.getText().toString()==null)
            {
                Toast.makeText(this,"select atleast one symptom",Toast.LENGTH_LONG).show();
            }
            else {
                Intent i = new Intent(this,Symptoms.class);
                i.putExtra("message",symptoms);
                startActivity(i);
            }


            /*
            String str="Neurology";
            Intent i = new Intent(this,ImagesActivity.class);
            i.putExtra("name",str);
            startActivity(i);
            */
        }
    }
}
