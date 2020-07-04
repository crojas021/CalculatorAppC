package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
//import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText Num1;
    private EditText Num2;
    private TextView Result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = (EditText)findViewById(R.id.txt_num1);
        Num2 = (EditText)findViewById(R.id.txt_num2);
        Result = (TextView)findViewById(R.id.txt_resultado);
    }

    //Este metodo realiza la resta
    public void Resta(View view){
        String Valor1 = Num1.getText().toString();
        String Valor2 = Num2.getText().toString();

        int num1 = Integer.parseInt(Valor1);
        int num2 = Integer.parseInt(Valor2);

        int rest = num1 - num2;

        String resultado = String.valueOf(rest);
        Result.setText(resultado);
    }

    public void Suma(View view){
        String Valor1 = Num1.getText().toString();
        String Valor2 = Num2.getText().toString();

        int num1 = Integer.parseInt(Valor1);
        int num2 = Integer.parseInt(Valor2);

        int rest = num1 + num2;

        String resultado = String.valueOf(rest);
        Result.setText(resultado);
    }

    public void Multiplicacion(View view){
        String Valor1 = Num1.getText().toString();
        String Valor2 = Num2.getText().toString();

        int num1 = Integer.parseInt(Valor1);
        int num2 = Integer.parseInt(Valor2);

        int sum = num1 * num2;

        String resultado = String.valueOf(sum);
        Result.setText(resultado);
    }

    public void Division(View view){
        String Valor1 = Num1.getText().toString();
        String Valor2 = Num2.getText().toString();

        int num1 = Integer.parseInt(Valor1);
        int num2 = Integer.parseInt(Valor2);

        int sum = num1 / num2;

        String resultado = String.valueOf(sum);
        Result.setText(resultado);
    }
}