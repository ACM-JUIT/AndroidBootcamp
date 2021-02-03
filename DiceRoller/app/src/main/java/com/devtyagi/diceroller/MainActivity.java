package com.devtyagi.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnRollDice;
    ImageView imgDiceImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRollDice = findViewById(R.id.btnRollDice);
        imgDiceImage = findViewById(R.id.imgDiceImage);

        btnRollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });

    }

    private void rollDice() {
        Random randomNum = new Random();
        int diceNumber = randomNum.nextInt(6) + 1;
        switch (diceNumber) {
            case 1: imgDiceImage.setImageResource(R.drawable.dice1);
                break;
            case 2: imgDiceImage.setImageResource(R.drawable.dice2);
                break;
            case 3: imgDiceImage.setImageResource(R.drawable.dice3);
                break;
            case 4: imgDiceImage.setImageResource(R.drawable.dice4);
                break;
            case 5: imgDiceImage.setImageResource(R.drawable.dice5);
                break;
            case 6: imgDiceImage.setImageResource(R.drawable.dice6);
                break;
        }
    }


}