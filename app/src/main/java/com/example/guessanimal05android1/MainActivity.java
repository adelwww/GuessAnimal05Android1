package com.example.guessanimal05android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button dog, cat, squirrel;
    boolean isDog, isCat, isSquirrel;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initClicker();

    }

    private void initClicker() {
        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isDog) {
                    Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isCat) {
                    Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        squirrel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSquirrel) {
                    Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void initView() {
        imageView = findViewById(R.id.image_animal);
        dog = findViewById(R.id.dog_btn);
        cat = findViewById(R.id.cat_btn);
        squirrel = findViewById(R.id.squirrel_btn);
    }

    public void changeImage(View view) {
        switch (view.getId()) {
            case R.id.change_image_btn1:
                imageView.setImageResource(R.drawable.dog);
                isDog = true;
                isCat = false;
                isSquirrel = false;
                break;
            case R.id.change_image_btn2:
                imageView.setImageResource(R.drawable.cat);
                isCat = true;
                isDog = false;
                isSquirrel = false;
                break;
            case R.id.change_image_btn3:
                imageView.setImageResource(R.drawable.squirrel);
                isSquirrel = true;
                isDog = false;
                isCat = false;
                break;
        }
    }
}