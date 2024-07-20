package com.example.tritonapp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView txt;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt = findViewById(R.id.lblWelcome);
        btnBack = findViewById(R.id.btnBack);

        Intent i = getIntent();
        int roll_no = i.getIntExtra("roll", 0);
        String name = i.getStringExtra("name");
        txt.setText("Name: " + name + " , Roll: " + roll_no);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });
    }
}
