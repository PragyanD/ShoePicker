package com.example.shoepick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class InputActivity extends AppCompatActivity {
    Algo algo;
    Spinner spinFtype, spinUse, spinDurab, spinMat, spinSport, spinGen, spinPrice;
    Button btnEnter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displaying options
        spinFtype = findViewById(R.id.spinFtype);
        spinUse = findViewById(R.id.spinUse);
        spinDurab = findViewById(R.id.spinDurab);
        spinMat = findViewById(R.id.spinMat);
        spinSport = findViewById(R.id.spinSport);
        spinGen = findViewById(R.id.spinGen);
        spinPrice = findViewById(R.id.spinPrice);

        String[] typeVal = {"Low Arch", "Neutral Arch", "High Arch"};
        String[] useVal = {"Casual", "Professional"};
        String[] durabVal = {"Low", "Medium", "High"};
        String[] matVal = {"Mesh", "Non-Mesh"};
        String[] sportVal = {"Running", "Tennis", "Football"};
        String[] genVal = {"Male", "Female"};
        String[] priceVal = {};

        ArrayList<String> typeList = new ArrayList<>(Arrays.asList(typeVal));
        ArrayList<String> useList = new ArrayList<>(Arrays.asList(useVal));
        ArrayList<String> durabList = new ArrayList<>(Arrays.asList(durabVal));
        ArrayList<String> matList = new ArrayList<>(Arrays.asList(matVal));
        ArrayList<String> sportList = new ArrayList<>(Arrays.asList(sportVal));
        ArrayList<String> genList = new ArrayList<>(Arrays.asList(genVal));
        ArrayList<String> priceList = new ArrayList<>(Arrays.asList(priceVal));

        ArrayAdapter<String> typeAd = new ArrayAdapter<>(this,R.layout.text_styles, R.id.textview, typeList);
        ArrayAdapter<String> useAd = new ArrayAdapter<>(this,R.layout.text_styles, R.id.textview, useList);
        ArrayAdapter<String> durabAd = new ArrayAdapter<>(this,R.layout.text_styles, R.id.textview, durabList);
        ArrayAdapter<String> matAd = new ArrayAdapter<>(this,R.layout.text_styles, R.id.textview, matList);
        ArrayAdapter<String> sportAd = new ArrayAdapter<>(this,R.layout.text_styles, R.id.textview, sportList);
        ArrayAdapter<String> genAd = new ArrayAdapter<>(this,R.layout.text_styles, R.id.textview, genList);
        ArrayAdapter<String> priceAd = new ArrayAdapter<>(this,R.layout.text_styles, R.id.textview, priceList);

        spinFtype.setAdapter(typeAd);
        spinUse.setAdapter(useAd);
        spinDurab.setAdapter(durabAd);
        spinMat.setAdapter(matAd);
        spinSport.setAdapter(sportAd);
        spinGen.setAdapter(genAd);
        spinPrice.setAdapter(priceAd);

        //calculating algos
        btnEnter = findViewById(R.id.btnEnter);
        btnEnter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DataBaseHelper dbHelp = new DataBaseHelper(InputActivity.this);//change class name
                algo = new Algo();
                //populate
               // algo.uftype =

            }
        });

    }
}
