package com.example.intentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class Explisit extends AppCompatActivity {
    Button BackExp ;
    TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explisit);
        BackExp = (Button) findViewById(R.id.BackExp);
        showText = (TextView) findViewById(R.id.insertText);

        Bundle textOf = getIntent().getExtras();
        String ti = textOf.getString("yours");
        showText.setText(ti);

        BackExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(backIntent);
            }
        });
    }

    public void implicitButton(View view){
        switch(view.getId()){
            case (R.id.g1):
                Intent intentG = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(intentG);
                break;

            case (R.id.y1):
                Intent intentY = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
                startActivity(intentY);
        }

    }
}