package com.sipna.vidyotan2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.widget.Toolbar;

import android.text.TextPaint;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    TextView gradient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Custom Toolbar setup
        Toolbar customToolbar = findViewById(R.id.customToolbar);
        setSupportActionBar(customToolbar);

        // Left Image
        ImageView leftImageView = findViewById(R.id.leftImageView);
        leftImageView.setImageResource(R.drawable.sipna_logo); // Replace with your left image resource

        // Title Text
        TextView titleTextView = findViewById(R.id.titleTextView);
        titleTextView.setText("Sipna College of Engineering And Technology, Amravati");

        // Right Image
        ImageView rightImageView = findViewById(R.id.rightImageView);
        rightImageView.setImageResource(R.drawable.naac_logo); // Replace with your right image resource



        Button button1 = findViewById(R.id.cardButton1);
        Button button2 = findViewById(R.id.cardButton2);
        Button button3 = findViewById(R.id.cardButton3);
        Button button4 = findViewById(R.id.cardButton4);
        Button button5 = findViewById(R.id.cardButton5);
        Button button6 = findViewById(R.id.cardButton6);
        Button button7 = findViewById(R.id.cardButton7);
        Button button8 = findViewById(R.id.cardButton8);
        Button button9 = findViewById(R.id.cardButton9);
        Button button10 = findViewById(R.id.cardButton10);
        Button button11 = findViewById(R.id.cardButton11);
        Button button12 = findViewById(R.id.cardButton12);
        Button button13 = findViewById(R.id.cardButton13);
        Button button14 = findViewById(R.id.cardButton14);
        Button button15 = findViewById(R.id.cardButton15);
        Button button16 = findViewById(R.id.cardButton16);
        Button button17 = findViewById(R.id.cardButton17);
        // Add more buttons as needed...

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the corresponding new activity for button1
                Intent intent = new Intent(MainActivity.this, StartupConclaveActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the corresponding new activity for button2
                Intent intent = new Intent(MainActivity.this, TechnicalQuizActivity.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the corresponding new activity for button2
                Intent intent = new Intent(MainActivity.this, CivilSnakeActivity.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the corresponding new activity for button2
                Intent intent = new Intent(MainActivity.this, BoxCricketActivity.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the corresponding new activity for button2
                Intent intent = new Intent(MainActivity.this, CirciutFixer.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the corresponding new activity for button2
                Intent intent = new Intent(MainActivity.this, DesignYourTS.class);
                startActivity(intent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the corresponding new activity for button2
                Intent intent = new Intent(MainActivity.this, WebApp.class);
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the corresponding new activity for button2
                Intent intent = new Intent(MainActivity.this, DigitalTreasure.class);
                startActivity(intent);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the corresponding new activity for button2
                Intent intent = new Intent(MainActivity.this, IPL.class);
                startActivity(intent);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the corresponding new activity for button2
                Intent intent = new Intent(MainActivity.this, PaperCastle.class);
                startActivity(intent);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the corresponding new activity for button2
                Intent intent = new Intent(MainActivity.this, ESport.class);
                startActivity(intent);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the corresponding new activity for button2
                Intent intent = new Intent(MainActivity.this, ShutterSplash.class);
                startActivity(intent);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the corresponding new activity for button2
                Intent intent = new Intent(MainActivity.this, Robotics.class);
                startActivity(intent);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the corresponding new activity for button2
                Intent intent = new Intent(MainActivity.this, MakeAThon.class);
                startActivity(intent);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the corresponding new activity for button2
                Intent intent = new Intent(MainActivity.this, ScreenDStructure.class);
                startActivity(intent);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the corresponding new activity for button2
                Intent intent = new Intent(MainActivity.this, Spazio.class);
                startActivity(intent);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start the corresponding new activity for button2
                Intent intent = new Intent(MainActivity.this, YakshaPrashna.class);
                startActivity(intent);
            }
        });

    }
}
