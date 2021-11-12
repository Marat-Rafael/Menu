package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
// clase debe implementar interfaz del listener
public class a1 extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    RadioGroup orientacion;
    RadioGroup gravity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);

        orientacion=(RadioGroup) findViewById(R.id.orientacion);
        orientacion.setOnCheckedChangeListener(this);

        gravity =findViewById(R.id.gravity);
        gravity.setOnCheckedChangeListener(this);

    }

    public void onCheckedChanged(RadioGroup radioGroup, int checkedId){
        switch(checkedId){
            case R.id.horizontal:
                orientacion.setOrientation(LinearLayout.HORIZONTAL);
                break;
            case R.id.vertical:
                orientacion.setOrientation(LinearLayout.VERTICAL);
                break;
            case R.id.left:
                gravity.setGravity(Gravity.LEFT);
                break;
            case R.id.center:
                gravity.setGravity(Gravity.CENTER);
                break;
            case R.id.right:
                gravity.setGravity(Gravity.RIGHT);
                break;
        }
    }
}