package com.example.nephrotoui.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nephrotoui.Models.Patient;
import com.example.nephrotoui.R;

import java.util.ArrayList;

public class PatientRecyclerAdapter extends  RecyclerView.Adapter<PatientRecyclerAdapter.ViewHolder>{

    private ArrayList<Patient> mPatients = new ArrayList<>();

    public PatientRecyclerAdapter(ArrayList<Patient> patients) {
        this.mPatients = patients;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_patient_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView patient_id, timestamp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            patient_id = itemView.findViewById(R.id.patient_id);
            timestamp = itemView.findViewById(R.id.patient_timestap);
        }
    }
}
