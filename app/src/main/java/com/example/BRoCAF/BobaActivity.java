package com.example.BRoCAF;

<<<<<<< HEAD
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
=======
import android.os.Bundle;
>>>>>>> e15d9b35afcd6f39c6573dd6df98702a6d451437

import androidx.appcompat.app.AppCompatActivity;


public class BobaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boba);

        ImageButton backButton = findViewById(R.id.backMainPage1);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BobaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

}