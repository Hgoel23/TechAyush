package com.example.kalya.harsh;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import org.w3c.dom.Text;

public class KnowDiseases extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemSelectedListener{
    Button myself,wife,father,other;
    EditText age;
    RadioGroup radioGroup;
    RadioButton radioButton;
    String selected = null,Disease,Gender = null;
    RelativeLayout tick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_know_diseases);
        age = (EditText)findViewById(R.id.agefield);
        myself = (Button)findViewById(R.id.MySelf);
        wife = (Button)findViewById(R.id.Wife);
        other = (Button)findViewById(R.id.Other);
        father = (Button)findViewById(R.id.Father);
        tick = (RelativeLayout)findViewById(R.id.ok);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
// Apply the adapter to the spinner
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.clearCheck();
        myself.setOnClickListener(this);
        wife.setOnClickListener(this);
        other.setOnClickListener(this);
        father.setOnClickListener(this);
        tick.setOnClickListener(this);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radioButton = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
                //Toast.makeText(KnowDiseases.this,radioButton.getText(),Toast.LENGTH_LONG).show();
                Gender = radioButton.getText().toString();
            }
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onClick(View v) {
        if (v == myself)
        {
            myself.setBackgroundResource(R.drawable.background_login);
            wife.setBackgroundResource(R.drawable.background_signup);
            father.setBackgroundResource(R.drawable.background_signup);
            other.setBackgroundResource(R.drawable.background_signup);
            selected = "myself";
        }
        if (v == wife)
        {
            wife.setBackgroundResource(R.drawable.background_login);
            father.setBackgroundResource(R.drawable.background_signup);
            other.setBackgroundResource(R.drawable.background_signup);
            myself.setBackgroundResource(R.drawable.background_signup);
            selected = "wife";
        }
        if (v == father)
        {
            selected = "father";
            father.setBackgroundResource(R.drawable.background_login);
            wife.setBackgroundResource(R.drawable.background_signup);
            other.setBackgroundResource(R.drawable.background_signup);
            myself.setBackgroundResource(R.drawable.background_signup);
        }
        if (v == other)
        {
            selected = "other";
            other.setBackgroundResource(R.drawable.background_login);
            wife.setBackgroundResource(R.drawable.background_signup);
            father.setBackgroundResource(R.drawable.background_signup);
            myself.setBackgroundResource(R.drawable.background_signup);
        }
        if (v == tick)
        {
            if (selected!=null)
            {
                if (TextUtils.isEmpty(age.getText().toString()))
                {
                    Toast.makeText(this,"please enter age",Toast.LENGTH_LONG).show();
                }else {
                    if (Gender!= null)
                    {
                            Toast.makeText(this,"Thank you for submiting data",Toast.LENGTH_LONG).show();
                            Intent i = new Intent(this,Symptoms.class);
                            startActivity(i);

                    }else {
                        Toast.makeText(this,"please select gender",Toast.LENGTH_LONG).show();
                    }
                }
            }else {
                Toast.makeText(this,"please select relationship",Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Disease = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
