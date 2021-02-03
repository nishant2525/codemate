package com.example.codemate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginfaculty extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginfaculty);
        Button login = (Button) findViewById(R.id.button11);
        EditText username = (EditText) findViewById(R.id.editTextTextMultiLine1);
        EditText password = (EditText) findViewById(R.id.editTextTextPassword21);
        String user_name = username.getText().toString();
        String pass_word = password.getText().toString();
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (user_name.equals("faculty") & pass_word.equals("faculty123")) {
                    Intent intent = new Intent(loginfaculty.this, faculty.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Login successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Login failed", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}
