package com.dictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class AddCountryActivity extends AppCompatActivity {
 EditText etCon, etCap;
 Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_country);

        etCap = findViewById(R.id.etCap);
        etCon = findViewById(R.id.etCon);
        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Save();
            }
        });
    }

    private void Save(){
        try {
            PrintStream printStream = new PrintStream((openFileOutput("word.txt", MODE_PRIVATE | MODE_APPEND)));
            printStream.println(etCon.getText().toString() + "->" + etCap.getText().toString());
            Toast.makeText(this, "Save To" + getFilesDir(), Toast.LENGTH_LONG).show();
        }


        catch (FileNotFoundException e) {
            Log.d("Dictionary app", "Error:" + e.toString());
            e.printStackTrace();
        }
    }
}
