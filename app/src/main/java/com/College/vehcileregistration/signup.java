package com.College.vehcileregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
     Button signup;
     EditText ROllno,password,Phonenumber,Email;
    DatebaseFunction DBF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
       signup =(Button)findViewById(R.id.signbutton);
       ROllno =findViewById(R.id.roll2);
       password =findViewById(R.id.pwd2);
       Phonenumber =findViewById(R.id.phone);
       Email =findViewById(R.id.mail);
       DBF=new DatebaseFunction(this);


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean result= DBF.insertdata(ROllno.getText().toString(),Phonenumber.getText().toString(),password.getText().toString(),Email.getText().toString());
                if(result){
                Intent intent3=new Intent(signup.this,loginpage.class);
                startActivity(intent3);
                    Toast.makeText(signup.this,"Registration Successfully",Toast.LENGTH_LONG).show();
                }
                else    {
                    Toast.makeText(signup.this,"Error",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}