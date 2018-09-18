package com.example.kalya.harsh;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity{
    private static EditText Email,Password,Name1,ConformPassword,Mobile;
    private Button submit;
    private ProgressDialog progressDialog;
    // [START declare_auth]
    private FirebaseAuth mAuth;
    // [END declare_auth]
    private FirebaseAuth.AuthStateListener mAuthListener;
    boolean mVerificationInProgress = false;
    String mVerificationId;
    private int job;
    PhoneAuthProvider.ForceResendingToken mResendToken;
    PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);mAuth = FirebaseAuth.getInstance();
        //to know weather the user is loged in into our app or not if he loged in then open another activity
        if (mAuth.getCurrentUser() != null){
            mAuth.signOut();
        }
        Name1 = (EditText)findViewById(R.id.editTextName);
        submit = (Button)findViewById(R.id.submitinreg);
        Email = (EditText)findViewById(R.id.editTextEmail);
        Password = (EditText)findViewById(R.id.editTextPassword);
        ConformPassword = (EditText)findViewById(R.id.conformPassword);
        Mobile = (EditText)findViewById(R.id.Name);
        progressDialog = new ProgressDialog(this);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String  email = Email.getText().toString();
                final String  password = Password.getText().toString();
                final String  conformpassword = ConformPassword.getText().toString();
                final String  mobile = Mobile.getText().toString();
                final String  name = Name1.getText().toString();
                if (TextUtils.isEmpty(email)) {
                        Toast.makeText(SignUp.this, "please enter email", Toast.LENGTH_LONG).show();
                    } else {
                        if (TextUtils.isEmpty(password)) {
                            Toast.makeText(SignUp.this, "please enter password", Toast.LENGTH_LONG).show();
                        } else {
                            if (TextUtils.isEmpty(conformpassword)) {
                                Toast.makeText(SignUp.this, "please enter conformpassword", Toast.LENGTH_LONG).show();
                            } else {
                                if (TextUtils.isEmpty(name)) {
                                    Toast.makeText(SignUp.this, "please enter Name", Toast.LENGTH_LONG).show();
                                } else {
                                    if (password.equals(conformpassword) && (Password.length() >= 6)) {
                                                userLogin();
                                    } else {
                                    Toast.makeText(SignUp.this, "enter correct password and password must be atleast 6 characters", Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    private void userLogin(){

        progressDialog.setMessage("Logining.......");
        progressDialog.show();
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
//to check weather he is right user or not (Authentication)
        String email = Email.getText().toString().trim();
        String password = Password.getText().toString().trim();
        Toast.makeText(this,email,Toast.LENGTH_LONG).show();
        Toast.makeText(this,password,Toast.LENGTH_LONG).show();
        mAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(SignUp.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //Log.d("FirebaseAuth", "onComplete" + task.getException().getMessage());
                        if (task.isSuccessful()){
                            Toast.makeText(SignUp.this,"Created user with crendientials",Toast.LENGTH_LONG).show();
                            Intent i = new Intent(SignUp.this,Home.class);
                            startActivity(i);
                            finish();
                        }else
                        {
                            Toast.makeText(SignUp.this, "Could not register.. please try again", Toast.LENGTH_SHORT).show();
                            progressDialog.dismiss();
                        }
                    }
                });
    }
}
