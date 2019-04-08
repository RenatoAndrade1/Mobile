package com.example.android.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void calc(View v){
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("");
        menu.add("Calc");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getTitle().toString()){
            case "Menu" :
                
        }

        //Toast.makeText(this, item.getTitle().toString(), Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }
}
