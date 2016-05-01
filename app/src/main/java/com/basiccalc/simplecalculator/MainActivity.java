package com.basiccalc.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {
    private Button btnAdd, btnSub, btnMul, btnDiv;
    private TextView answer;
    private EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init()
    {
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        answer=(TextView)findViewById(R.id.answer);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();
        switch (view.getId()) {
            case R.id.btnAdd:
                int addition = Integer.parseInt(n1) + Integer.parseInt(n2);
                answer.setText(String.valueOf(addition));
                break;
            case R.id.btnSub:
                int subtraction = Integer.parseInt(n1) - Integer.parseInt(n2);
                answer.setText(String.valueOf(subtraction));
                break;
            case R.id.btnMul:
                int multiply = Integer.parseInt(n1) * Integer.parseInt(n2);
                answer.setText(String.valueOf(multiply));
                break;
            case R.id.btnDiv:
                try {
                    float division = Float.parseFloat(n1) / Float.parseFloat(n2);
                    answer.setText(String.valueOf(division));
                } catch (Exception e) {
                    answer.setText("cannot divide");

                }
                break;
        }
    }
}