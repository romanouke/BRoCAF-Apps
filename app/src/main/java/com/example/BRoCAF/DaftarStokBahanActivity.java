package com.example.BRoCAF;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DaftarStokBahanActivity extends AppCompatActivity {

    private ImageButton[] addButton;
    private  ImageButton[] subtractButton;
    private TextView[] TextView;
    private int[] itemValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_stok_bahan);

        TextView = new TextView[8];
        addButton = new ImageButton[8];
        subtractButton = new ImageButton[8];
        itemValues = new int[8];

        TextView[0] = findViewById(R.id.textView100);
        TextView[1] = findViewById(R.id.textView101);
        TextView[2] = findViewById(R.id.textView102);
        TextView[3] = findViewById(R.id.textView103);
        TextView[4] = findViewById(R.id.textView104);
        TextView[5] = findViewById(R.id.textView107);
        TextView[6] = findViewById(R.id.textView106);
        TextView[7] = findViewById(R.id.textView105);

        addButton[0] = findViewById(R.id.addButton1);
        addButton[1] = findViewById(R.id.addButton2);
        addButton[2] = findViewById(R.id.addButton3);
        addButton[3] = findViewById(R.id.addButton4);
        addButton[4] = findViewById(R.id.addButton5);
        addButton[5] = findViewById(R.id.addButton6);
        addButton[6] = findViewById(R.id.addButton7);
        addButton[7] = findViewById(R.id.addButton8);

        subtractButton[0] = findViewById(R.id.subtractButton1);
        subtractButton[1] = findViewById(R.id.subtractButton2);
        subtractButton[2] = findViewById(R.id.subtractButton3);
        subtractButton[3] = findViewById(R.id.subtractButton4);
        subtractButton[4] = findViewById(R.id.subtractButton5);
        subtractButton[5] = findViewById(R.id.subtractButton6);
        subtractButton[6] = findViewById(R.id.subtractButton7);
        subtractButton[7] = findViewById(R.id.subtractButton8);

        ImageButton tmplnkpButton = findViewById(R.id.imageButton5);
        ImageButton reportButton = findViewById(R.id.imageButton9);

        tmplnkpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DaftarStokBahanActivity.this, tampilan_utama_kp_activity.class);
                startActivity(intent);
            }
        });

        reportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DaftarStokBahanActivity.this, report_in_activity.class);
                startActivity(intent);
            }
        });

        for(int i = 0; i < itemValues.length; i++) {
            itemValues[i] = 0;
            updateTextView(i);
        }
        for(int i = 0; i < addButton.length; i++){
            final int index = i;
            addButton[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    itemValues[index]++;
                    updateTextView(index);
                }
            });
        }
        for(int i = 0; i < subtractButton.length; i++){
            final int index = i;
            subtractButton[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    itemValues[index]--;
                    updateTextView(index);
                }
            });
        }


    }

    private void updateTextView(int index) {
        TextView[index].setText(String.valueOf(itemValues[index]));
    }

}