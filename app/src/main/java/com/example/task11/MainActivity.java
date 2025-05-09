package com.example.task11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    Switch sw;
    RadioGroup RG;
    Button change;
    ConstraintLayout screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sw = findViewById(R.id.sw);
        RG = findViewById(R.id.RG);
        change = findViewById(R.id.change);
        screen = findViewById(R.id.main);
    }

    public void setColor(View view) {
        if (sw.isChecked()) {
            updateBackground();
        }
    }

    public void check(View view) {
        if (!sw.isChecked()) {
            updateBackground();
        }
    }

    private void updateBackground() {
        int selected = RG.getCheckedRadioButtonId();

        if (selected == R.id.rb1) {
            screen.setBackgroundResource(R.drawable.red);
        } else if (selected == R.id.rb2) {
            screen.setBackgroundResource(R.drawable.blue1);
        } else if (selected == R.id.rb3) {
            screen.setBackgroundResource(R.drawable.pink);
        } else if (selected == R.id.rb4) {
            screen.setBackgroundResource(R.drawable.purple);
        }
    }
}
