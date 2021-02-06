package com.example.codemate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class faculty extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher);
        Button record=(Button)findViewById(R.id.button10);
        record.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent =new Intent(faculty.this,recordmainjava.class);
                startActivity(intent);
            }
        });

        Button upload=(Button)findViewById(R.id.button8);
        upload.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent =new Intent(faculty.this,webview.class);
                startActivity(intent);
            }
        });
    }
}
