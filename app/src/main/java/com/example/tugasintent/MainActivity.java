package com.example.tugasintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText edtNama, edtTelepon;
    Button btnSendNama, btnsendTelepon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNama = findViewById(R.id.edtNama);
        edtTelepon = findViewById(R.id.edtTelepon);
        btnSendNama = findViewById(R.id.btnSendNama);
        btnsendTelepon = findViewById(R.id.btnSendTelepon);

        btnSendNama.setOnClickListener(this);
        btnsendTelepon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnSendNama){
            String nama = edtNama.getText().toString();
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra(MainActivity2.EXTRA_NAME, nama);
            startActivity(intent);
        }else if (v.getId() == R.id.btnSendTelepon){
            String telepon = edtTelepon.getText().toString();
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + telepon));
            startActivity(intent);
        }
    }
}