package com.dictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class CapitalActivity extends AppCompatActivity {
private TextView tvCapital;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);
        tvCapital = findViewById(R.id.tvCname);

        Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            String capital = bundle.getString("capital");
            tvCapital.setText(capital);
        }
    }
}
