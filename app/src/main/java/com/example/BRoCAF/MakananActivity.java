package com.example.BRoCAF;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MakananActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        ImageButton backButton = findViewById(R.id.backMainPage3);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MakananActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}