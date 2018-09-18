package com.example.kalya.harsh;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button login,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button)findViewById(R.id.Login);
        signup = (Button)findViewById(R.id.Signup);
        login.setOnClickListener(this);
        signup.setOnClickListener(this);
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View view) {
        if(view == login)
        {
            Intent intent = new Intent(this,LoginPage1.class);
            startActivity(intent);
        }
        if (view == signup)
        {
            Intent intent = new Intent(this,SignUp.class);
            startActivity(intent);
        }
    }
}
