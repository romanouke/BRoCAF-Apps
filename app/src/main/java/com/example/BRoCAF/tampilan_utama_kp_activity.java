package com.example.BRoCAF;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class tampilan_utama_kp_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_utama_kp);

        ImageButton reportButton = findViewById(R.id.imageButton9);
        ImageButton dftrstckButton = findViewById(R.id.imageButton11);

        reportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tampilan_utama_kp_activity.this, DaftarStokBahanActivity.class);
                startActivity(intent);
            }
        });

    }
}