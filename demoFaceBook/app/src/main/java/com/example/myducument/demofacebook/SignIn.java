package com.example.myducument.demofacebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    private EditText mEditUser;
    private EditText mEditPass;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        inIt();
        onClick();
    }

    private void onClick() {
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(SignIn.this, "Tao tai khoan thanh cong!!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void inIt() {
        mEditUser = findViewById(R.id.edit_username);
        mEditPass = findViewById(R.id.edit_password);
        mButton = findViewById(R.id.button_login);
    }
}
