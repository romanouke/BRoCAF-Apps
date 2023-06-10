package com.example.BRoCAF;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class HotDrinksActivity extends AppCompatActivity {

    DatabaseReference database;
    TextView nameTextView;
    TextView priceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_drinks);

        database = FirebaseDatabase.getInstance().getReference();
        nameTextView = findViewById(R.id.Choco);
        priceTextView = findViewById(R.id.priceChoco);

        ImageButton addButton = findViewById(R.id.ButtonChoco);
        ImageButton backButton = findViewById(R.id.backMainPage2);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HotDrinksActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameTextView.getText().toString();
                double price = Double.parseDouble(priceTextView.getText().toString());
                addToCart(name, price);
            }
        });
    }

    private void addToCart(String name, double price) {
        if (!name.isEmpty() && price > 0) {
            String cartItemId = database.child("cart").push().getKey();
            FoodItem foodItem = new FoodItem(name, price);
            database.child("cart").child(cartItemId).setValue(foodItem);
            Toast.makeText(this, "Item added to cart", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Invalid item", Toast.LENGTH_SHORT).show();
        }
    }

}
