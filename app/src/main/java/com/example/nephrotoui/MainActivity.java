package com.example.nephrotoui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.nephrotoui.Adapters.PatientRecyclerAdapter;
import com.example.nephrotoui.Models.Patient;
import com.example.nephrotoui.Utils.VerticalSpacingItemDecorator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //UI Components
    private RecyclerView mRecyclerView;

    //Variables
    private ArrayList<Patient> mPatients = new ArrayList<>();
    private PatientRecyclerAdapter mPatientRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerView);

        initRecyclerView();
        insertFakePatients();
    }

    private void insertFakePatients(){
        for(int i = 0; i < 100; i++){
            Patient patient = new Patient();
            patient.setPatient_id("Patient #" + i);
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
        mPatientRecyclerAdapter = new PatientRecyclerAdapter(mPatients);
        mRecyclerView.setAdapter(mPatientRecyclerAdapter);
    }
}
