package com.example.nephrotoui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class KidneyDetails extends AppCompatActivity {

    private static final String TAG = "KidneyDetails";
    private static final int REQUEST_CODE_CHECK = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidney_details);

        setSupportActionBar((Toolbar)findViewById(R.id.view_kidney_metrics));
        setTitle("View Kidney Metrics");

        final TextView donorName = findViewById(R.id.view_donor_name);
        final TextView dimLength = findViewById(R.id.view_kidney_length);
        final TextView dimWidth = findViewById(R.id.view_kidney_width);
        final TextView amtArteries = findViewById(R.id.view_num_of_arteries);
        final TextView distArteries = findViewById(R.id.view_dist_of_arteries);
        final TextView boolAbnormalities = findViewById(R.id.view_bool_abnormalities);
        final TextView boolSurgDamage = findViewById(R.id.view_bool_surg_damage);

        Intent viewMetrics = getIntent();
        donorName.setText(viewMetrics.getStringExtra("View_Donor_Name"));
        dimLength.setText(viewMetrics.getStringExtra("View_Length") + " cm");
        dimWidth.setText(viewMetrics.getStringExtra("View_Width") + " cm");
        amtArteries.setText(viewMetrics.getStringExtra("View_#_of_Arteries"));
        distArteries.setText(viewMetrics.getStringExtra("View_Dist_of_Arteries") + " cm");
        boolAbnormalities.setText(viewMetrics.getStringExtra("View_Abnormalities"));
        boolSurgDamage.setText(viewMetrics.getStringExtra("View_Surg_Damage"));

    }
}
