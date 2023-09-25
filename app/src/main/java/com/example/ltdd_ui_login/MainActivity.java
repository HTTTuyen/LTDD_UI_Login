package com.example.ltdd_ui_login;

import androidx.appcompat.app.AppCompatActivity;

import android.media.ImageReader;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username= (TextView) findViewById(R.id.username);
        TextView password= (TextView) findViewById(R.id.pass);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (username.getText().toString().equals("Tuyen") && password.getText().toString().equals("Tuyen")){
                    //CORRECT
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULL",Toast.LENGTH_SHORT).show();
                }
                else {
                    //INCORRECT
                    Toast.makeText(MainActivity.this, "LOGIN FAIL",Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}