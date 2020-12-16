package com.example.text1213;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt_login;
    EditText et_usernanme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_login=findViewById(R.id.button2);
        et_usernanme=findViewById(R.id.et_username);
        bt_login=findViewById(R.id.bt_login);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                switch (v.getId()) {
                    case R.id.button2:
                        String inputText=et_usernanme.getText().toString();
                        Toast.makeText(MainActivity.this,"1234567890",Toast.LENGTH_SHORT).show();
                    break;
                }
        });

                }
    }