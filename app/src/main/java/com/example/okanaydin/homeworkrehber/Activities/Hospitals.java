package com.example.okanaydin.homeworkrehber.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.okanaydin.homeworkrehber.Hospitals.Hospital1;
import com.example.okanaydin.homeworkrehber.R;

import static com.example.okanaydin.homeworkrehber.R.id.hastane1;
import static com.example.okanaydin.homeworkrehber.R.id.hastane10;
import static com.example.okanaydin.homeworkrehber.R.id.hastane11;
import static com.example.okanaydin.homeworkrehber.R.id.hastane12;
import static com.example.okanaydin.homeworkrehber.R.id.hastane13;
import static com.example.okanaydin.homeworkrehber.R.id.hastane14;
import static com.example.okanaydin.homeworkrehber.R.id.hastane15;
import static com.example.okanaydin.homeworkrehber.R.id.hastane16;
import static com.example.okanaydin.homeworkrehber.R.id.hastane17;
import static com.example.okanaydin.homeworkrehber.R.id.hastane18;
import static com.example.okanaydin.homeworkrehber.R.id.hastane19;
import static com.example.okanaydin.homeworkrehber.R.id.hastane2;
import static com.example.okanaydin.homeworkrehber.R.id.hastane20;
import static com.example.okanaydin.homeworkrehber.R.id.hastane3;
import static com.example.okanaydin.homeworkrehber.R.id.hastane4;
import static com.example.okanaydin.homeworkrehber.R.id.hastane5;
import static com.example.okanaydin.homeworkrehber.R.id.hastane6;
import static com.example.okanaydin.homeworkrehber.R.id.hastane7;
import static com.example.okanaydin.homeworkrehber.R.id.hastane8;
import static com.example.okanaydin.homeworkrehber.R.id.hastane9;

public class Hospitals extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout h1, h2, h3, h4, h5, h6, h7, h8, h9, h10;
    private LinearLayout h11, h12, h13, h14, h15, h16, h17, h18, h19, h20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);

        h1=(LinearLayout)findViewById(hastane1);
        h2=(LinearLayout)findViewById(hastane2);
        h3=(LinearLayout)findViewById(hastane3);
        h4=(LinearLayout)findViewById(hastane4);
        h5=(LinearLayout)findViewById(hastane5);
        h6=(LinearLayout)findViewById(hastane6);
        h7=(LinearLayout)findViewById(hastane7);
        h8=(LinearLayout)findViewById(hastane8);
        h9=(LinearLayout)findViewById(hastane9);
        h10=(LinearLayout)findViewById(hastane10);
        h11=(LinearLayout)findViewById(hastane11);
        h12=(LinearLayout)findViewById(hastane12);
        h13=(LinearLayout)findViewById(hastane13);
        h14=(LinearLayout)findViewById(hastane14);
        h15=(LinearLayout)findViewById(hastane15);
        h16=(LinearLayout)findViewById(hastane16);
        h17=(LinearLayout)findViewById(hastane17);
        h18=(LinearLayout)findViewById(hastane18);
        h19=(LinearLayout)findViewById(hastane19);
        h20=(LinearLayout)findViewById(hastane20);

       h1.setOnClickListener(this);
       h2.setOnClickListener(this);
       h3.setOnClickListener(this);
       h4.setOnClickListener(this);
       h5.setOnClickListener(this);
       h6.setOnClickListener(this);
       h7.setOnClickListener(this);
       h8.setOnClickListener(this);
       h9.setOnClickListener(this);
       h10.setOnClickListener(this);
       h11.setOnClickListener(this);
       h12.setOnClickListener(this);
       h13.setOnClickListener(this);
       h14.setOnClickListener(this);
       h15.setOnClickListener(this);
       h16.setOnClickListener(this);
       h17.setOnClickListener(this);
       h18.setOnClickListener(this);
       h19.setOnClickListener(this);
       h20.setOnClickListener(this);



    }

    public void onClick(View v){
        switch (v.getId()){
            case hastane1: startActivity(new Intent(getApplicationContext(), Hospital1.class)); break;
            case hastane2: toast(); break;
            case hastane3: toast(); break;
            case hastane4: toast(); break;
            case hastane5: toast(); break;
            case hastane6: toast(); break;
            case hastane7: toast(); break;
            case hastane8: toast(); break;
            case hastane9: toast(); break;
            case hastane10: toast(); break;
            case hastane11: toast(); break;
            case hastane12: toast(); break;
            case hastane13: toast(); break;
            case hastane14: toast(); break;
            case hastane15: toast(); break;
            case hastane16: toast(); break;
            case hastane17: toast(); break;
            case hastane18: toast(); break;
            case hastane19: toast(); break;
            case hastane20: toast(); break;
        }
    }

    public void toast(){
        Toast.makeText(getApplicationContext(),"hastane",Toast.LENGTH_SHORT).show();
    }

}
