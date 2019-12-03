package com.example.wallpaperapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WallpaperApp extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper_app);

        btn1 = (Button) findViewById(R.id.btn_wal1);
        btn2 = (Button) findViewById(R.id.btn_wal2);
        btn3 = (Button) findViewById(R.id.btn_wal3);
        btn4 = (Button) findViewById(R.id.btn_wal4);
        btn5 = (Button) findViewById(R.id.btn_wal5);
        btn6 = (Button) findViewById(R.id.btn_wal6);
        btn7 = (Button) findViewById(R.id.btn_wal7);
        btn8 = (Button) findViewById(R.id.btn_wal8);
        btn9 = (Button) findViewById(R.id.btn_wal9);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WallpaperApp.this, ThemeActivity.class);
                String pathpic = "btn1";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WallpaperApp.this, ThemeActivity.class);
                String pathpic = "btn2";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WallpaperApp.this, ThemeActivity.class);
                String pathpic = "btn3";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WallpaperApp.this, ThemeActivity.class);
                String pathpic = "btn4";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WallpaperApp.this, ThemeActivity.class);
                String pathpic = "btn5";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WallpaperApp.this, ThemeActivity.class);
                String pathpic = "btn6";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WallpaperApp.this, ThemeActivity.class);
                String pathpic = "btn7";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WallpaperApp.this, ThemeActivity.class);
                String pathpic = "btn8";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WallpaperApp.this, ThemeActivity.class);
                String pathpic = "btn9";
                i.putExtra("PATH_PICTURE", pathpic);
                startActivity(i);
            }
        });
    }
}

