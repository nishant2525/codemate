package com.example.codemate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginstudent extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginstudent);
        Button login = (Button) findViewById(R.id.button12);
        EditText username = (EditText) findViewById(R.id.editTextTextMultiLine);
        EditText password = (EditText) findViewById(R.id.editTextTextPassword2);
        String user_name = username.getText().toString();
        String pass_word = password.getText().toString();
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (user_name.equals("student") & pass_word.equals("student123")) {
                    Intent intent = new Intent(loginstudent.this, student.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Login successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Login failed", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}