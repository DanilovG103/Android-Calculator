package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.firstNumber);
        num2 = findViewById(R.id.secondNumber);
        res = findViewById(R.id.result);
    }

    public float[] getValues(View v) {
        float n1 = Float.parseFloat(num1.getText().toString());
        float n2 = Float.parseFloat(num2.getText().toString());
        float[] values = {n1, n2};
        return values;
    }

    public void sumNumbers(View v) {
        float a = getValues(v)[0];
        float b = getValues(v)[1];
        float sum = a + b;
        res.setText(Float.toString(sum));
    }

    public void diffNumbers(View v) {
        float a = getValues(v)[0];
        float b = getValues(v)[1];
        float diff = a - b;
        res.setText(Float.toString(diff));
    }

    public void multNumbers(View v) {
        float a = getValues(v)[0];
        float b = getValues(v)[1];
        float mult = a * b;
        res.setText(Float.toString(mult));
    }

    public void divideNumbers(View v) {
        float a = getValues(v)[0];
        float b = getValues(v)[1];
        float divideRes = a / b;
        res.setText(Float.toString(divideRes));
    }
}