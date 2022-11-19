package com.example.alcala_giancarlo_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sp1BtnCall = (Button)findViewById(R.id.SP1); //button listener
        sp1BtnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp = getSharedPreferences("User Preferences", Context.MODE_PRIVATE);
                SharedPreferences.Editor edit = sp.edit();
                edit.putString("Task", "Saving Data");
                edit.putString("Location", "SharedPreferences");
            }
        });
    }





}