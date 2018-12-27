package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageball = (ImageView) findViewById(R.id.image_eightball);
        Button askbutton = (Button) findViewById(R.id.askbutton);
        final int[] dicearray = new int[] {
              R.drawable.ball1,
              R.drawable.ball2,
              R.drawable.ball3,
              R.drawable.ball4,
              R.drawable.ball5

        };
        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomnumber = new Random();
                int number = randomnumber.nextInt(5);
                imageball.setImageResource(dicearray[number]);
            }
        });
    }
}
