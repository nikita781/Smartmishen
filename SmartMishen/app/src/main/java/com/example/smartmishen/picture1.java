package com.example.smartmishen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class picture1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture1);
    }
    public void onClick(View view) {
        Intent i;
        i = new Intent(this, analiz.class);
        startActivity(i);
    }
}