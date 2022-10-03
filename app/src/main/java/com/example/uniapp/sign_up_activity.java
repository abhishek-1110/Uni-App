package com.example.uniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class sign_up_activity extends AppCompatActivity {
    private TextView signIn_page;
    private EditText email;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_activity);

        // ********* To Swap Between Sign Up & Sign In Screen *********
        signIn_page = findViewById(R.id.signIn_page);
        signIn_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(sign_up_activity.this, sign_in_activity.class);
                startActivity(i);
            }
        });
        // ********* End *********
    }
}