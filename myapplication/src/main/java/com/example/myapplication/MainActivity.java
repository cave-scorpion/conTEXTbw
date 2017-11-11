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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinnerAF = (Spinner) findViewById(R.id.spinnerAF);
        Spinner spinnerCO = (Spinner) findViewById(R.id.spinnerCO);
        Spinner spinnerFP = (Spinner) findViewById(R.id.spinnerFP);
        Spinner spinnerHA = (Spinner) findViewById(R.id.spinnerHA);
        Spinner spinnerNN = (Spinner) findViewById(R.id.spinnerNN);
        Spinner spinnerOMW = (Spinner) findViewById(R.id.spinnerOMW);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinner_text));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerAF.setAdapter(myAdapter);
        spinnerAF.setSelection(0);
        spinnerCO.setAdapter(myAdapter);
        spinnerCO.setSelection(1);
        spinnerFP.setAdapter(myAdapter);
        spinnerFP.setSelection(2);
        spinnerHA.setAdapter(myAdapter);
        spinnerHA.setSelection(3);
        spinnerNN.setAdapter(myAdapter);
        spinnerNN.setSelection(4);
        spinnerOMW.setAdapter(myAdapter);
        spinnerOMW.setSelection(5);

        spinnerAF.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                final String AFtone = spinnerAF.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(), AFtone, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinnerCO.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //String COtone = spinnerCO.getSelectedItem().toString();
                //Toast.makeText(getApplicationContext(), COtone, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinnerFP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //String FPtone = spinnerFP.getSelectedItem().toString();
                //Toast.makeText(getApplicationContext(), FPtone, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinnerHA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //String HAtone = spinnerHA.getSelectedItem().toString();
                //Toast.makeText(getApplicationContext(), HAtone, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinnerNN.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //String NNtone = spinnerNN.getSelectedItem().toString();
                //Toast.makeText(getApplicationContext(), NNtone, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinnerOMW.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //String OMWtone = spinnerOMW.getSelectedItem().toString();
                //Toast.makeText(getApplicationContext(), OMWtone, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
