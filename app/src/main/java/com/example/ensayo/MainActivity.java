package com.example.ensayo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProviderOperation;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etLoginName;
    private EditText etLoginPassword;
    private Button btnLoginSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContenView();
        btnLoginSend.setOnClickListener(this);
        etLoginPassword.setOnClickListener(this);
        etLoginName.setOnClickListener(this);

    }

    private void setContenView(){
        etLoginName = findViewById(R.id.txtUsername);
        etLoginPassword = findViewById(R.id.txtPassword);
        btnLoginSend = findViewById(R.id.btnlogin);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btnlogin){
            sendLogin();



        }

    }

    private void sendLogin(){

        String Name ="steven";
        String contra = "admin";

        if (etLoginName.getText().toString().equals(Name) && etLoginPassword.getText().toString().equals(contra) ){
            //Toast.makeText(this,"Hola "+ Name+" "+contra, Toast.LENGTH_LONG).show();
            Intent CalculatorIntent = new Intent(this,CalculatorActivity.class);
            startActivity(CalculatorIntent);
        }
        else {

            Toast.makeText(this,"No puedes Ingresar ", Toast.LENGTH_LONG).show();
        }
        //Toast.makeText(this,"Hola "+ fullText, Toast.LENGTH_LONG).show();

    }

}