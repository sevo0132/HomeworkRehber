package com.example.okanaydin.homeworkrehber;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

public class BilgilerActivity extends AppCompatActivity {

    private RecyclerView mBilgilerList;

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilgiler);


        mDatabase= FirebaseDatabase.getInstance().getReference().child("Bilgiler");

        mBilgilerList=(RecyclerView)findViewById(R.id.bilgilerList);
        mBilgilerList.setHasFixedSize(true);
        mBilgilerList.setLayoutManager(new LinearLayoutManager(this));


    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseRecyclerAdapter<Bilgiler, BilgilerViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Bilgiler, BilgilerViewHolder>(

                Bilgiler.class,
                R.layout.bilgiler_row,
                BilgilerViewHolder.class,
                mDatabase
        ) {
            @Override
            protected void populateViewHolder(BilgilerViewHolder viewHolder, Bilgiler model, int position) {

                viewHolder.setTitle(model.getTitle());
                viewHolder.setDesc(model.getDesc());
                viewHolder.setImage(getApplicationContext(),model.getImage());

            }
        };


        mBilgilerList.setAdapter(firebaseRecyclerAdapter);

    }


    public static class BilgilerViewHolder extends RecyclerView.ViewHolder{

        View mView;

        public BilgilerViewHolder(View itemView) {
            super(itemView);

            mView= itemView;
        }

        public void setTitle(String title){

            TextView post_title = (TextView) mView.findViewById(R.id.post_title);
            post_title.setText(title);
        }

        public void setDesc(String desc){

            TextView post_title = (TextView) mView.findViewById(R.id.post_desc);
            post_title.setText(desc);
        }

        public void setImage(Context ctx, String image){
            ImageView post_image = (ImageView) mView.findViewById(R.id.post_image);
            Picasso.with(ctx).load(image).into(post_image);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.action_add){
            startActivity(new Intent(getApplicationContext(), BilgiGirisi.class));
        }

        return super.onOptionsItemSelected(item);
    }
}

