package com.example.intentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView yourT;
    Button expButton, impButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expButton = (Button) findViewById(R.id.exButton);
        yourT = (EditText) findViewById(R.id.yourText);
    }
    public void something(View view){
        Intent intent = new Intent(MainActivity.this, Explisit.class);
        intent.putExtra("yours",yourT.getText().toString());
        startActivity(intent);

    }

}