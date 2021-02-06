package com.example.codemate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginfaculty extends Activity {
    private Button loginf;
    private EditText usernamef;
    private EditText passwordf;
    private String user_nameff;
    private String pass_wordff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginfaculty);
        loginf = (Button) findViewById(R.id.button11);
        usernamef = (EditText) findViewById(R.id.editTextTextMultiLine1);
        passwordf = (EditText) findViewById(R.id.editTextTextPassword21);
        user_nameff = usernamef.getText().toString();
        pass_wordff = passwordf.getText().toString();
        loginf.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if ((user_nameff.equals("faculty") )&& (pass_wordff.equals("123")) ){
                    Intent intent = new Intent(loginfaculty.this, faculty.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Login successful", Toast.LENGTH_SHORT).show();
                }
                else {
                 Toast.makeText(getApplicationContext(), "Login failed", Toast.LENGTH_SHORT).show();
                 }
            }

        });
    }
}