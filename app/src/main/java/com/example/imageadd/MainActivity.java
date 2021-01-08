package com.example.imageadd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView1,imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 =(ImageView) findViewById(R.id.imageview1Id);
        imageView2 =(ImageView) findViewById(R.id.imageview2Id);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.imageview1Id){
            Toast.makeText(this, "Masha", Toast.LENGTH_SHORT).show();
        }
        if(view.getId() == R.id.imageview2Id){
            Toast.makeText(this, "Shinchan", Toast.LENGTH_SHORT).show();
        }
    }
}