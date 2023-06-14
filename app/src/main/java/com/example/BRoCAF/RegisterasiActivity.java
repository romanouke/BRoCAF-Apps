package com.example.BRoCAF;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterasiActivity extends AppCompatActivity {

    EditText regisUsername, regisEmail, regisPassword, regisRepass;
    ImageButton regisButton;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerasi);

        regisUsername = findViewById(R.id.username);
        regisEmail = findViewById(R.id.email);
        regisPassword = findViewById(R.id.password);
        regisRepass = findViewById(R.id.repass);
        regisButton = findViewById(R.id.Button_Daftar);

        regisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database = FirebaseDatabase.getInstance();
                reference = database.getReference("Users");

                String username = regisUsername.getText().toString();
                String email = regisEmail.getText().toString();
                String password = regisPassword.getText().toString();
                String repass = regisRepass.getText().toString();

                DataClass user = new DataClass(username, email, password, repass);
                reference.child(username).setValue(user);

                Toast.makeText(RegisterasiActivity.this, "Anda Berhasil Membuat", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RegisterasiActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
