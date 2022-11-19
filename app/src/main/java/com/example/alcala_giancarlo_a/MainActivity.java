package com.example.alcala_giancarlo_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

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

        Button es1BtnCall = (Button)findViewById(R.id.ES1); //button listener
        es1BtnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String task1 = "task : ";
                String task2 = "Saving Data ";
                String Location1 = "location : ";
                String Location2 = "External Storage";

                String details1 = task1 + " " + task2;
                String details2 = Location1 + " " + Location2;

                FileOutputStream fos = null;
                try {
                    File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                    File file = new File(folder, "NameExternal.txt");
                    fos = new FileOutputStream(file);
                    fos.write(details1.getBytes());
                    fos.write(details2.getBytes());

                } catch (IOException e) {
                }
            }
        });
    }





}