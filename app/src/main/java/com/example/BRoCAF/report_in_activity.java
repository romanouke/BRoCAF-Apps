package com.example.BRoCAF;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class report_in_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_in);

        ImageButton tmplnkpButton = findViewById(R.id.imageButton5);
        ImageButton dftrstckButton = findViewById(R.id.imageButton11);

        tmplnkpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(report_in_activity.this, tampilan_utama_kp_activity.class);
                startActivity(intent);
            }
        });

        dftrstckButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(report_in_activity.this, DaftarStokBahanActivity.class);
                startActivity(intent);
            }
        });

    }
}