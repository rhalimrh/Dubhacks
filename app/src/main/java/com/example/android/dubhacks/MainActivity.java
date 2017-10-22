package com.example.android.dubhacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity{
    Spinner spinnerDropDown;
    ImageButton submit_button;
    ToggleButton bandAid_button;
    ToggleButton pad_button;
    ToggleButton condom_button;
    String selected = "";
    String[] essentials = {"Select ...", "Tampons", "Menstruation Pad", "Condoms", "Band-Aid"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pressBandAidButton(View view) {
        bandAid_button = (ToggleButton) findViewById(R.id.button_bandaid);
    }

    // Finds users when button is pressed
    public void pressButton(View view) {
        submit_button = (ImageButton) findViewById(R.id.button_submit);
    }


}
