package com.example.tritonapp1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SumOfTwoNumber extends AppCompatActivity {

    private EditText txtNum1, txtNum2, txtResult;
    private TextView lblResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_of_two_number);

        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        txtResult = findViewById(R.id.txtResult);
        lblResult = findViewById(R.id.lblResult);
        Button btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNumbers();
            }
        });
    }

    private void addNumbers() {
        try {
            double num1 = Double.parseDouble(txtNum1.getText().toString());
            double num2 = Double.parseDouble(txtNum2.getText().toString());
            double sum = num1 + num2;

            lblResult.setText("Sum of Two Numbers:");
            txtResult.setText(String.valueOf(sum));
        } catch (NumberFormatException e) {
            lblResult.setText("Invalid input");
            txtResult.setText("");
        }
    }
}