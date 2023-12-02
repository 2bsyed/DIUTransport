package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private ImageButton button2;
    TextView txt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button2= (ImageButton) findViewById(R.id.button2);
        txt=(TextView)findViewById(R.id.textView);
        String showroute= getIntent().getStringExtra("txt");
        txt.setText(showroute);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }
    public void openActivity(){
        Intent Intent = new Intent(this, MainActivity.class);
        startActivity(Intent);
    }
}