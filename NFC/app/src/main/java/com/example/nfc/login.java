package com.example.nfc;

import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.Toast;
import android.view.View;
import androidx.appcompat.app.AlertDialog;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class login extends AppCompatActivity {
    Button btn_lregister, btn_llogin, button;
    EditText et_lusername, et_lpassword;

    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        databaseHelper = new DatabaseHelper(this);

        et_lusername = (EditText) findViewById(R.id.et_lusername);
        et_lpassword = (EditText) findViewById(R.id.et_lpassword);

        btn_llogin = (Button) findViewById(R.id.btn_llogin);
        btn_lregister = (Button) findViewById(R.id.btn_lregister);


        btn_lregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openReg1();
            }
        });



        btn_llogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = et_lusername.getText().toString();
                String password = et_lpassword.getText().toString();

                Boolean checklogin = databaseHelper.CheckLogin(username, password);
                if (checklogin == true) {

                    openMain();
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid username or password", Toast.LENGTH_SHORT).show();
                }


            }



        });
    }

    public void openReg1() {
        Intent intent = new Intent(this, reg1.class);
        startActivity(intent);
    }

    public void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
