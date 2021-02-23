package com.example.nfc;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class settings extends AppCompatActivity {
    private Button button;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);




        button = (Button) findViewById(R.id.logOutBtn);
        button.setOnClickListener(new View.OnClickListener() {
           @Override
          public void onClick(View v) {
            openLogin();
             }
         });
    }
    public void openLogin () {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }


}