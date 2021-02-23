package com.example.nfc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class transferID extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_i_d);



        button = (Button) findViewById(R.id.idBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTransNFC();
            }
        });
    }

    public void openTransNFC () {
        Intent intent = new Intent(this, TransNFC.class);
        startActivity(intent);
    }
}