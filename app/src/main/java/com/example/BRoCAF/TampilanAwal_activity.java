package com.example.BRoCAF;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class TampilanAwal_activity extends AppCompatActivity {

    private ImageButton ButtonBoba;
    private ImageButton ButtonFood;
    private ImageButton ButtonDrink;
    private ImageButton ButtonHotdrink;
    private ImageButton ButtonTambahHP;
    Button tmblMenu;
    private ImageButton ButtonKeranjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_awal);

        ButtonBoba = findViewById(R.id.Button_Boba);
        ButtonFood = findViewById(R.id.Button_Food);
        ButtonDrink = findViewById(R.id.Button_Drink);
        ButtonHotdrink = findViewById(R.id.Button_Hotdrink);
        ButtonTambahHP = findViewById(R.id.Button_tambahHP);
        ButtonKeranjang = findViewById(R.id.Button_Keranjang);
        tmblMenu = findViewById(R.id.button2);

        ButtonBoba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TampilanAwal_activity.this, BobaActivity.class);
                startActivity(intent);
            }
        });
        ButtonFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TampilanAwal_activity.this, MakananActivity.class);
                startActivity(intent);
            }
        });
        ButtonDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TampilanAwal_activity.this, SquashAndFloatActivity.class);
                startActivity(intent);
            }
        });
        ButtonHotdrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TampilanAwal_activity.this, HotDrinksActivity.class);
                startActivity(intent);
            }
        });
        tmblMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TampilanAwal_activity.this, menu_activity.class);
                startActivity(intent);
            }
        });
        ButtonKeranjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TampilanAwal_activity.this, orderP_activity.class);
                startActivity(intent);
            }
        });
    }
}