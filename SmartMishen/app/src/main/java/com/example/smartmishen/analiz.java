package com.example.smartmishen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class analiz extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analiz);
        Button buttonBack = (Button)findViewById(R.id.nazad);
        buttonBack.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Intent i;
        i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}