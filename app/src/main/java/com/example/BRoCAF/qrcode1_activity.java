package com.example.BRoCAF;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.zxing.integration.android.IntentIntegrator;

public class qrcode1_activity extends AppCompatActivity {

    private static final int CAMERA_PERMISSION_REQUEST_CODE = 200;
    private static final String TAG = "QRCode1Activity";
    private ImageButton scanButton;
    private DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode1);
        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(qrcode1_activity.this, Manifest.permission.CAMERA)
                        == PackageManager.PERMISSION_GRANTED) {
                    startQRCodeScan();
                } else {
                    ActivityCompat.requestPermissions(qrcode1_activity.this,
                            new String[]{Manifest.permission.CAMERA},
                            CAMERA_PERMISSION_REQUEST_CODE);
                }
            }
        });
    }

    private void startQRCodeScan() {
        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setOrientationLocked(false);
        integrator.initiateScan();
    }
//BELUM SELESAI BUAT KONEK QR
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
//        if (result != null) {
//            if (result.getContents() != null) {
//                String scannedData = result.getContents();
//                resultTextView.setText("Scan result: " + scannedData);
//                saveDataToDatabase(scannedData);
//            } else {
//                Log.d(TAG, "No QR code found");
//            }
//        } else {
//            super.onActivityResult(requestCode, resultCode, data);
//        }
//    }

    private void saveDataToDatabase(String data) {
        String entryId = database.child("entries").push().getKey();
        database.child("entries").child(entryId).setValue(data);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == CAMERA_PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                startQRCodeScan();
            } else {
                Log.d(TAG, "Camera permission denied");
            }
        }
    }
}
