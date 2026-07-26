package com.meditrack.ai.ui.patient;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.meditrack.ai.R;

public class PatientListActivity extends AppCompatActivity {

    private RecyclerView recyclerPatients;
    private ExtendedFloatingActionButton fabAddPatient;

    private PatientAdapter patientAdapter;
    private PatientViewModel patientViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_list);

        initialiseViews();
        setupRecyclerView();
        setupViewModel();
        setupClickListeners();
    }

    private void initialiseViews() {
        recyclerPatients = findViewById(R.id.recyclerPatients);
        fabAddPatient = findViewById(R.id.fabAddPatient);
    }

    private void setupRecyclerView() {
        patientAdapter = new PatientAdapter();

        recyclerPatients.setLayoutManager(new LinearLayoutManager(this));
        recyclerPatients.setHasFixedSize(true);
        recyclerPatients.setAdapter(patientAdapter);
    }

    private void setupViewModel() {
        patientViewModel =
                new ViewModelProvider(this).get(PatientViewModel.class);

        patientViewModel.getAllPatients().observe(this, patients -> {
            patientAdapter.submitList(patients);
        });
    }

    private void setupClickListeners() {
        fabAddPatient.setOnClickListener(v -> {
            // Add Patient screen will be connected next
        });
    }
}
