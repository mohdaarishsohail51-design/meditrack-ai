package com.meditrack.ai;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class DashboardActivity extends AppCompatActivity {

    private CardView patientsCard;
    private CardView recordsCard;
    private CardView scanReportCard;
    private CardView timelineCard;
    private CardView medicinesCard;
    private CardView assistantCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        initialiseViews();
        configureActions();
    }

    private void initialiseViews() {
        patientsCard = findViewById(R.id.cardPatients);
        recordsCard = findViewById(R.id.cardRecords);
        scanReportCard = findViewById(R.id.cardScanReport);
        timelineCard = findViewById(R.id.cardTimeline);
        medicinesCard = findViewById(R.id.cardMedicines);
        assistantCard = findViewById(R.id.cardAssistant);
    }

    private void configureActions() {
        patientsCard.setOnClickListener(
                view -> showFeatureStatus(getString(R.string.feature_patients))
        );

        recordsCard.setOnClickListener(
                view -> showFeatureStatus(getString(R.string.feature_records))
        );

        scanReportCard.setOnClickListener(
                view -> showFeatureStatus(getString(R.string.feature_scan_report))
        );

        timelineCard.setOnClickListener(
                view -> showFeatureStatus(getString(R.string.feature_timeline))
        );

        medicinesCard.setOnClickListener(
                view -> showFeatureStatus(getString(R.string.feature_medicines))
        );

        assistantCard.setOnClickListener(
                view -> showFeatureStatus(getString(R.string.feature_assistant))
        );
    }

    private void showFeatureStatus(String featureName) {
        String message = getString(
                R.string.feature_development_message,
                featureName
        );

        Toast.makeText(
                this,
                message,
                Toast.LENGTH_SHORT
        ).show();
    }
}
