package com.example.androidreviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static int r_value, g_value, b_value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);



        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                r_value = (int)(Math.random()*255);
                g_value = (int)(Math.random()*255);
                b_value = (int)(Math.random()*255);
                findViewById(R.id.button2).setBackgroundColor(Color.rgb(r_value, g_value, b_value));

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Color Changed to R: "+r_value+", G: "+g_value+", B: " +b_value,
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });


    }
}
