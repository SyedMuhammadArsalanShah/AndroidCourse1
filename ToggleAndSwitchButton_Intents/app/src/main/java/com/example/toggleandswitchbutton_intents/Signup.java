package com.example.toggleandswitchbutton_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Signup extends AppCompatActivity {
    ToggleButton toggleButton;
    Switch switchs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        toggleButton = findViewById(R.id.toggleButton);
        switchs=findViewById(R.id.switch1);
    }

    public void login(View view) {


        Intent intent = new Intent(Signup.this, MainActivity.class);
        startActivity(intent);


    }

    public void ToggleButton(View view) {


        Toast.makeText(this, "selected gender is" + toggleButton.getText(), Toast.LENGTH_SHORT).show();


    }

    public void switchb(View view) {
        if (switchs.isChecked()) {
            Toast.makeText(this, "selected Session  is morning", Toast.LENGTH_LONG).show();
        } else {


            Toast.makeText(this, "selected Session  is evening", Toast.LENGTH_SHORT).show();
        }

    }
}