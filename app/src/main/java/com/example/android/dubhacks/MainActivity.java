package com.example.android.dubhacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.content.Intent;

public class MainActivity extends AppCompatActivity{
    boolean selectPad = false;
    boolean selectCondom = false;
    boolean selectBandAid = false;

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

    // Press Band Aid button
    public void pressBandAidButton(View view) {
        bandAid_button = (ToggleButton) findViewById(R.id.button_bandaid);
        if(selectPad == true || selectCondom == true) {
            Toast.makeText(getApplicationContext(), "Just Pick One!", Toast.LENGTH_LONG).show();
        } else {
            if (selectBandAid == false) {
                selectBandAid = true;
            } else {
                selectBandAid = false;
            }
        }


    }

    // Press pad button
    public void pressPadButton(View view) {
        pad_button = (ToggleButton) findViewById(R.id.button_pad);
        if(selectBandAid == true || selectCondom == true) {
            Toast.makeText(getApplicationContext(), "Just Pick One!", Toast.LENGTH_LONG).show();
        } else {
            if(selectPad == false) {
                selectPad = true;
            } else {
                selectPad = false;
            }
        }
    }

    // Press condom button
    public void pressCondomButton(View view) {
        condom_button = (ToggleButton) findViewById(R.id.button_condom);
        if(selectBandAid == true || selectPad == true) {
            Toast.makeText(getApplicationContext(), "Just Pick One!", Toast.LENGTH_LONG).show();
        } else {
            if(selectCondom == false) {
                selectCondom = true;
            } else {
                selectCondom = false;
            }
        }
    }

    // Finds users when button is pressed
    public void pressButton(View view) {
        submit_button = (ImageButton) findViewById(R.id.button_submit);

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectPad) {
                    Intent padIntent = new Intent(MainActivity.this, pad_layer.class);
                    startActivity(padIntent);
                } else if(selectCondom) {
                    Intent condomIntent = new Intent(MainActivity.this, condom_layer.class);
                    startActivity(condomIntent);
                } else if(selectBandAid) {
                    Intent bandAidIntent = new Intent(MainActivity.this, bandAid_layer.class);
                    startActivity(bandAidIntent);
                }
            }
        });
    }


}
