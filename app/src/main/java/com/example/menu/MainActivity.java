package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void actividad_1(View view){
        Intent intent = new Intent(this, a1.class);
        //EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void actividad_2(View view){
        Intent intent = new Intent(this,a2.class);
        startActivity(intent);
    }
    public void actividad_3(View view){
        Intent intent = new Intent(this,a3.class);
        startActivity(intent);
    }
    public void actividad_4(View view){
        Intent intent = new Intent(this,a4.class);
        startActivity(intent);
    }
    public void actividad_5(View view){
        Intent intent = new Intent(this,a5.class);
        startActivity(intent);
    }
    public void actividad_6(View view){
        Intent intent = new Intent(this,a6.class);
        startActivity(intent);
    }
    public void actividad_7(View view){
        Intent intent = new Intent(this,a7.class);
        startActivity(intent);
    }
}