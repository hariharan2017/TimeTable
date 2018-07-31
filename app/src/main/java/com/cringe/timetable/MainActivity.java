package com.cringe.timetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt1, bt2, bt3, bt4, bt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Monclick(View view) {
        Intent intent = new Intent(MainActivity.this, Monday.class);
        startActivity(intent);
    }

    public void Tueclick(View view) {
        Intent intent = new Intent(MainActivity.this, Tuesday.class);
        startActivity(intent);
    }

    public void Wedclick(View view) {
        Intent intent = new Intent(MainActivity.this, Wednesday.class);
        startActivity(intent);
    }

    public void Thurclick(View view) {
        Intent intent = new Intent(MainActivity.this, Thursday.class);
        startActivity(intent);
    }

    public void Friclick(View view) {
        Intent intent = new Intent(MainActivity.this, Friday.class);
        startActivity(intent);
    }

}


