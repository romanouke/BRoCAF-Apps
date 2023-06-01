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

public class TampilanAwal_activity extends AppCompatActivity {

    ImageButton btnPelanggan, btnKaryawan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_awal);
        btnKaryawan.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                Toast.makeText(TampilanAwal_activity.this, "Anda Berhasil Membuat", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(TampilanAwal_activity.this, LoginActivity.class);
                startActivity(intent);
                }
        });
        btnPelanggan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TampilanAwal_activity.this, "Anda Berhasil Membuat", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(TampilanAwal_activity.this, menu_activity.class);
                startActivity(intent);
            }
        });
    }

}