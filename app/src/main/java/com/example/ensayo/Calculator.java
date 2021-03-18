package com.example.ensayo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    EditText teNumberOne;
    EditText teNumberTwo;
    Button btnSumar;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        setContentView();
    }
    private void setContentView(){
        teNumberOne = findViewById(R.id.numero1);
        teNumberTwo = findViewById(R.id.numero2);
        btnSumar = findViewById(R.id.btnsuma);
        tvResult = findViewById(R.id.Resultado);
        tvResult.setTextSize(30);
        btnSumar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
      if (v.getId()==R.id.btnsuma){
        int number1 = Integer.parseInt(teNumberOne.getText().toString());
        int number2 = Integer.parseInt(teNumberTwo.getText().toString());
        sumar(number1,number2);
      }
    }

    private void sumar(int number1, int number2){
      tvResult.setText(String.valueOf(number1+number2));

    }
}