package com.example.android.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText visor;
    EditText visorResult;

    int result;
    char operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visor = (EditText) findViewById(R.id.visor);
        visorResult = (EditText) findViewById(R.id.visorResult);

    }

    public void funBut(View v) {

        Button bt = (Button) v;
        visor.setText(visor.getText()+bt.getText().toString());
    }


    public void funOpe(View v){

        String valor = visor.getText().toString();

        if (!valor.equals("")){
            fun(Integer.parseInt(valor));
        }

        Button bt = (Button) v;
        operador = bt.getText().toString().charAt(0);

        visorResult.setText(visorResult.getText()+" "+valor+" "+operador);

        visor.setText("");

        if(operador == '='){
            visorResult.setText(visorResult.getText()+" "+result);
            operador = ' ';
        }



    }


    public void fun(int value){

        switch(operador){
            case '+': result += value;
                break;
            case '-': result -= value;
                break;
            case '/': result /= value;
                break;
            case '*': result *= value;
                break;
            default: result = value;
                visorResult.setText("");
                break;

        }

    }

    public void volt(View v){
        finish();
    }

}
