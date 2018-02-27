package com.demo.sayantansarkar.rotatetimepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import picker.ugurtekbas.com.Picker.Picker;

public class MainActivity extends AppCompatActivity {

    private Picker picker, picker2, pickerSec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        picker = findViewById(R.id.picker);
        picker.setShowHr(true);
        picker2 = findViewById(R.id.picker2);
        picker2.setShowHr(false);
        pickerSec = findViewById(R.id.pickerSec);
        pickerSec.setShowHr(false);
        //picker.setHourFormat(true);
    }
}
