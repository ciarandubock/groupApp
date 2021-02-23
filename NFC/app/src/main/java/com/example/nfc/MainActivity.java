package com.example.nfc;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



public class MainActivity extends AppCompatActivity {
    private ImageButton settingsLogo;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        settingsLogo = (ImageButton) findViewById(R.id.settingsLogo);
        settingsLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openSettings();
            }

        });

        button = (Button) findViewById(R.id.transferbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTransfer1();
            }
        });

        button = (Button) findViewById(R.id.receivebtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReceive1();
            }
        });


    }

        public void openSettings () {
            Intent intent = new Intent(this, settings.class);
            startActivity(intent);
        }

    public void openTransfer1 () {
        Intent intent = new Intent(this, transfer1.class);
        startActivity(intent);
    }
    public void openReceive1 () {
        Intent intent = new Intent(this, receive1.class);
        startActivity(intent);
    }


    }

