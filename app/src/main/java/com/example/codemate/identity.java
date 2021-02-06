package com.example.codemate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class identity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.identity);
        Button student =(Button)findViewById(R.id.button4);
        Button faculty =(Button)findViewById(R.id.button3);
        faculty.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent =new Intent(identity.this,faculty.class);
                startActivity(intent);
            }
        });
        student.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent =new Intent(identity.this,student.class);
                startActivity(intent);
            }
        });

    }

}

