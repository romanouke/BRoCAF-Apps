package com.example.BRoCAF;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class TampilanAwal_activity extends AppCompatActivity {

    private ImageButton btnPelanggan, btnKaryawan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_awal);

        btnPelanggan = findViewById(R.id.Button_Pelanggan);
        btnKaryawan = findViewById(R.id.Button_Pemilik);

        btnKaryawan.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                Intent intent = new Intent(TampilanAwal_activity.this, LoginActivity.class);
                startActivity(intent);
                }
        });
        btnPelanggan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TampilanAwal_activity.this, qrcode1_activity.class);
                startActivity(intent);
            }
        });
    }

}