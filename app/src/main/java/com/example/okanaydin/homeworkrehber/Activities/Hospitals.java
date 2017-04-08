package com.example.okanaydin.homeworkrehber.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.okanaydin.homeworkrehber.Hospitals.Hospital1;
import com.example.okanaydin.homeworkrehber.R;


public class Hospitals extends AppCompatActivity {

 private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);

        listView= (ListView) findViewById(R.id.hospitalListView);

        // Defined Array values to show in ListView
        final String[] values = getResources().getStringArray(R.array.my_string_array);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;


                int length =getResources().getStringArray(R.array.my_string_array).length;

                for (int i=0; i<=length-1; i++)  {


                    if (position == i) {
                        Intent intent = new Intent(getApplicationContext(), Hospital1.class);
                        intent.putExtra("hAdi",values[i]);
                        startActivity(intent);

                    }


                }



            }

        });





    }

}
