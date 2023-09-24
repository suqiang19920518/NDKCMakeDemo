package com.example.ndkcmakedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String stringFromNDK = NDKTools.getStringFromNDK();
        ((TextView) findViewById(R.id.tv_main)).setText(stringFromNDK);
    }
}