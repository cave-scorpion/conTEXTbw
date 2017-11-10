package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerAF, spinnerCO, spinnerFP, spinnerHA, spinnerNN, spinnerOMW;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerAF = findViewById(R.id.spinnerAF);
        spinnerCO = findViewById(R.id.spinnerCO);
        spinnerFP = findViewById(R.id.spinnerFP);
        spinnerHA = findViewById(R.id.spinnerHA);
        spinnerNN = findViewById(R.id.spinnerNN);
        spinnerOMW = findViewById(R.id.spinnerOMW);

        final List<String> toneList = new ArrayList<String>();
                toneList.add("Tone 1");
                toneList.add("Tone 2");
                toneList.add("Tone 3");
                toneList.add("Tone 4");
                toneList.add("Tone 5");
                toneList.add("Tone 6");

                ArrayAdapter<String> simpleAdapter = new ArrayAdapter<>(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,toneList);
                spinnerAF.setAdapter(simpleAdapter);
//                spinnerCO.setAdapter(simpleAdapter);
//                spinnerFP.setAdapter(simpleAdapter);
//                spinnerHA.setAdapter(simpleAdapter);
//                spinnerNN.setAdapter(simpleAdapter);
//                spinnerOMW.setAdapter(simpleAdapter);

                spinnerAF.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Toast.makeText(MainActivity.this, toneList.get(i), Toast.LENGTH_LONG.show());
                    }
                });
    }
}
