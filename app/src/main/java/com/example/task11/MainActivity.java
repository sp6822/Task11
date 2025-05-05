package com.example.task11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    View rootView;
    Switch sw;
     RadioGroup RG;
     Button change;
     ConstraintLayout screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = (ConstraintLayout) findViewById(R.id.main);
        sw = findViewById(R.id.sw);
        RG = findViewById(R.id.RG);
        change = findViewById(R.id.change);
    }
    public void setColor(View view)
    {
        if (sw.isChecked())
        {
            change_color();
        }
    }
        public void check(View view) {
            if (!sw.isChecked()) {
                change_color();
            }
        }
        public void change_color() {
            int selectedId = RG.getCheckedRadioButtonId();
            if (selectedId == R.id.rb1) {
                screen.setBackgroundResource(R.drawable.red);
            } else if (selectedId == R.id.rb2) {
                screen.setBackgroundResource(R.drawable.blue1);
            } else if (selectedId == R.id.rb3) {
                screen.setBackgroundResource(R.drawable.pink);
            } else if (selectedId == R.id.rb4) {
                screen.setBackgroundResource(R.drawable.purple);
            }
        }
}