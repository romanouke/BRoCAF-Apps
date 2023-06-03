package com.example.BRoCAF;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DaftarStokBahanActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton addButton1;
    private ImageButton addButton2;
    private ImageButton addButton3;
    private ImageButton addButton4;
    private ImageButton addButton5;
    private ImageButton addButton6;
    private ImageButton addButton7;
    private ImageButton addButton8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_stok_bahan);

        addButton1 = findViewById(R.id.addButton1);
        addButton2 = findViewById(R.id.addButton2);
        addButton3 = findViewById(R.id.addButton3);
        addButton4 = findViewById(R.id.addButton4);
        addButton5 = findViewById(R.id.addButton5);
        addButton6 = findViewById(R.id.addButton6);
        addButton7 = findViewById(R.id.addButton7);
        addButton8 = findViewById(R.id.addButton8);

        addButton1.setOnClickListener(this);
        addButton2.setOnClickListener(this);
        addButton3.setOnClickListener(this);
        addButton4.setOnClickListener(this);
        addButton5.setOnClickListener(this);
        addButton6.setOnClickListener(this);
        addButton7.setOnClickListener(this);
        addButton8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}