package com.example.compaq.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText etusername, etpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etusername=(EditText)findViewById(R.id.etusername);
        etpassword=(EditText)findViewById(R.id.etpassword);

    }

    public void login(View view) {
        if (etusername.getText().toString().equals("admin")&& etpassword.getText().toString().equals("admin")){
        startActivity(new Intent(MainActivity.this,Main2Activity.class));
        }else{
            Toast.makeText(getApplicationContext(),"Username atau Password anda salah", Toast.LENGTH_SHORT).show();
        }
    }

    public void signup(View view) {

    }
}




