package ru.javabreeze.hfad.starbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ru.jababreeze.hfad.starbuzz.R;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
    }
}
