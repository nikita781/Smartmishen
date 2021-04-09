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
    }
    @Override
    public void onClick(View view) {
        Intent i;
        i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void onClick1(View view) {
        Intent i;
        i = new Intent(this, picture1.class);
        startActivity(i);
    }
    public void onClick2(View view) {
        Intent i;
        i = new Intent(this, picture2.class);
        startActivity(i);
    }
    public void onClick3(View view) {
        Intent i;
        i = new Intent(this, picture3.class);
        startActivity(i);
    }
}