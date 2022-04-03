package com.College.vehcileregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginpage extends AppCompatActivity {
EditText ROllno,Password;
DatebaseFunction DBF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        final Button signup =(Button)findViewById(R.id.loginbutton2);
        ROllno=findViewById(R.id.rollnol);
        Password=findViewById(R.id.pwdl);
        DBF =new DatebaseFunction(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent2 = new Intent(loginpage.this, signup.class);
                    startActivity(intent2);

            }
        });

        Button login =(Button)findViewById(R.id.loginbutton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(loginpage.this,dashboard.class);
                startActivity(intent4);


//                boolean result=DBF.LoginUser(ROllno.getText().toString(),Password.getText().toString());
//                if(result) {
//                    Intent intent4=new Intent(loginpage.this,dashboard.class);
//                    startActivity(intent4);
//                }else{
//                    Toast.makeText(loginpage.this,"Error",Toast.LENGTH_LONG).show();
//                }
            }




        });
    }
}