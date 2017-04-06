package com.example.okanaydin.homeworkrehber.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.example.okanaydin.homeworkrehber.R;

public class Transportation extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportation);

        WebView myWebView = (WebView) findViewById(R.id.activity_ulasim);
        myWebView.loadUrl("http://web.trafi.com/?nomo=1");

    }
}
