package com.dictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {
Button btnAddCon, btnAddCap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnAddCon = findViewById(R.id.btnAddCon);
        btnAddCap = findViewById(R.id.btnAddCap);

        btnAddCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this,AddCountryActivity.class);
                startActivity(intent);
            }
        });

        btnAddCap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(DashboardActivity.this,CapitalActivity.class);
                startActivity(intent2);
            }
        });
    }
}
