package com.example.constraintlayouttoastandclickevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button maryam ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         maryam=findViewById(R.id.button4);

         maryam.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(MainActivity.this, "Account Successfully created", Toast.LENGTH_LONG).show();
             }
         });

    }


    public void hamza(View view) {

        Toast.makeText(this, "Login Successfully  ", Toast.LENGTH_SHORT).show();
    }
}

// LayoutInflater layoutInflater = getLayoutInflater();
//             View layout =layoutInflater.inflate(R.layout.activity_main2,(ViewGroup)findViewById(R.id.act));
//             Toast toast =new Toast(getApplicationContext());
//             toast.setView(layout);
//             toast.setDuration(Toast.LENGTH_SHORT);
//             toast.show();