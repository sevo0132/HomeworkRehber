package com.example.okanaydin.homeworkrehber.Hospitals;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.okanaydin.homeworkrehber.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Hospital1 extends AppCompatActivity implements OnMapReadyCallback{
    private TextView hBilgi, HospitalAd;
    private GoogleMap mMap;
    private String hAdi,bilgi,bolumler,x,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital1);
        hBilgi = (TextView) findViewById(R.id.hBilgi);
        HospitalAd = (TextView) findViewById(R.id.Ad);

        hAdi = getIntent().getExtras().getString("hAdi");
        //bilgi = getIntent().getExtras().getString("bilgiler");
        //bolumler = getIntent().getExtras().getString("bölümler");
        //x = getIntent().getExtras().getString("x");
        //y = getIntent().getExtras().getString("hAdi");


        HospitalAd.setText(hAdi);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map1);
        mapFragment.getMapAsync(this);


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng sydney = new LatLng(Double.parseDouble("41.022901"),Double.parseDouble("29.1792203"));
        mMap.addMarker(new MarkerOptions().position(sydney).title(hAdi).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.setMinZoomPreference(16.0f);
        mMap.setMaxZoomPreference(24.0f);
    }

}
