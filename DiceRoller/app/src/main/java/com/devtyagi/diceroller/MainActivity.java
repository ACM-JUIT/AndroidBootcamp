package com.devtyagi.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.devtyagi.diceroller.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.diceAnimView.setVisibility(View.VISIBLE);
                binding.diceAnimView.playAnimation();
            }
        });

        binding.diceAnimView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                binding.imgDiceImage.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                binding.imgDiceImage.setVisibility(View.VISIBLE);
                binding.diceAnimView.setVisibility(View.GONE);
                rollDice();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

    }

    private void rollDice() {
        Random randomNum = new Random();
        int diceNumber = randomNum.nextInt(6) + 1;
        switch (diceNumber) {
            case 1: binding.imgDiceImage.setImageResource(R.drawable.dice1);
                break;
            case 2: binding.imgDiceImage.setImageResource(R.drawable.dice2);
                break;
            case 3: binding.imgDiceImage.setImageResource(R.drawable.dice3);
                break;
            case 4: binding.imgDiceImage.setImageResource(R.drawable.dice4);
                break;
            case 5: binding.imgDiceImage.setImageResource(R.drawable.dice5);
                break;
            case 6: binding.imgDiceImage.setImageResource(R.drawable.dice6);
                break;
        }
    }


}