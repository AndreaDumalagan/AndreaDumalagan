package com.example.nephrotoui;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.nephrotoui.Adapters.PatientRecyclerAdapter;
import com.example.nephrotoui.Models.Patient;
import com.example.nephrotoui.Utils.VerticalSpacingItemDecorator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements PatientRecyclerAdapter.OnPatientListener, View.OnClickListener {

    private static final String TAG = "MainActivity";

    //UI Components
    private RecyclerView mRecyclerView;


    //Variables
    private ArrayList<Patient> mPatients = new ArrayList<>();
    private PatientRecyclerAdapter mPatientRecyclerAdapter;

    ImageView imageView;
    Button btnTakePicture;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerView);

        findViewById(R.id.fab).setOnClickListener(this);

        initRecyclerView();
        insertFakePatients();

        setSupportActionBar((Toolbar)findViewById(R.id.patients_toolbar));
        setTitle("Patient List");

        //Buttons
        imageView = (ImageView) findViewById(R.id.imageView);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                //Open camera
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 100);
            }
        });

        /*btnTakePicture = (Button) findViewById(R.id.btnTakePicture);
        btnTakePicture.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                //Open camera
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 100);
            }
        });*/
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 100){
            //Get capture image
            Bitmap captureImage = (Bitmap) data.getExtras().get("data");
            //Set capture image to imageView (EVENTUALLY SEND TO DATABASE)
            imageView.setImageBitmap(captureImage);
        }
    }

    private void insertFakePatients(){
        for(int i = 0; i < 10; i++){
            Patient patient = new Patient();
            patient.setPatient_id("Patient #" + (i+1));
            patient.setContent("Content #" + i);
            patient.setTimestamp("Mar 2020");
            mPatients.add(patient);
        }
        mPatientRecyclerAdapter.notifyDataSetChanged();
    }

    private void initRecyclerView(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        VerticalSpacingItemDecorator itemDecorator = new VerticalSpacingItemDecorator(10);
        mRecyclerView.addItemDecoration(itemDecorator);
        mPatientRecyclerAdapter = new PatientRecyclerAdapter(mPatients, this);
        mRecyclerView.setAdapter(mPatientRecyclerAdapter);
    }

    @Override
    public void onPatientClick(int position) {
        Log.d(TAG, "onPatientClick: clicked " + position);

        Intent intent = new Intent(this, KidneyDetails.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, InputNewKidney.class);
        startActivity(intent);
    }
}
