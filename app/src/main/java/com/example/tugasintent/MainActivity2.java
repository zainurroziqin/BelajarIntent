package com.example.tugasintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_NAME = "Extra Name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtNama = findViewById(R.id.txtNama);

        String name = getIntent().getStringExtra(EXTRA_NAME);

        String text = "Name : " + name;
        txtNama.setText(text);

    }
}