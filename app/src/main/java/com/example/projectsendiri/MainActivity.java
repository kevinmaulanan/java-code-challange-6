package com.example.projectsendiri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber = rand.nextInt(20) + 1;
    }

    public void onSubmit(View view) {
        EditText editNumber = (EditText) findViewById(R.id.inputNumber);
        String text;

        int inputNumber = Integer.parseInt(editNumber.getText().toString());
        if (randomNumber > inputNumber) text = "Higher";
         else if (randomNumber < inputNumber) text = "Lower";
         else text = "That Is Right";

        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();


    }
}