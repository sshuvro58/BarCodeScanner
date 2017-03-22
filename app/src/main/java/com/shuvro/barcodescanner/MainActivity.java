package com.shuvro.barcodescanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button scanAcivity;
    Button scanFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scanAcivity = (Button) findViewById(R.id.scanAcivity);
        scanFragment = (Button) findViewById(R.id.scanFragment);
        scanAcivity.setOnClickListener(this);
        scanFragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.scanAcivity) {
            startActivity(new Intent(MainActivity.this, BarcodeScannerActivity.class));

        } else if (view.getId() == R.id.scanFragment) {
            getSupportFragmentManager().beginTransaction().add(android.R.id.content, new BarcodeScannerFragment(), "barcode_fragment").addToBackStack("barcode_fragment").commit();
        }
    }
}
