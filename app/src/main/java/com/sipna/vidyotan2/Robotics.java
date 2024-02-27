package com.sipna.vidyotan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Robotics extends AppCompatActivity {

    Button Reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robotics);

        Reg = findViewById(R.id.registerButton);

        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/forms/d/e/1FAIpQLSdzxLNyGr4DnkJuZB-XpYI39W_18RbCjNknVGEqUCCrR2bmWw/viewform?vc=0&c=0&w=1&flr=0");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));


    }
}