package com.example.okanaydin.homeworkrehber.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.okanaydin.homeworkrehber.R;

public class Anasayfa extends AppCompatActivity {


    private ImageButton btn_egitim, btn_hastane, btn_IOM, btn_pratik, btn_turkce, btn_ulasim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);

        btn_egitim=(ImageButton)findViewById(R.id.btnEgitim);
        btn_hastane=(ImageButton)findViewById(R.id.btnHastahane);
        btn_IOM=(ImageButton)findViewById(R.id.btnIOM);
        btn_pratik=(ImageButton)findViewById(R.id.btnPratik);
        btn_turkce=(ImageButton)findViewById(R.id.btnTurkce);
        btn_ulasim=(ImageButton)findViewById(R.id.btnUlasim);


        btn_egitim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        btn_hastane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        btn_IOM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        btn_pratik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        btn_turkce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        btn_ulasim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });


    }
}
