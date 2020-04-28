package com.example.nephrotoui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class KidneyDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidney_details);

        setSupportActionBar((Toolbar)findViewById(R.id.view_kidney_metrics));
        setTitle("View Kidney Metrics");

    }
}
