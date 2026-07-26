package com.meditrack.ai;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button getStartedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialiseViews();
        configureActions();
    }

    private void initialiseViews() {
        getStartedButton = findViewById(R.id.btnGetStarted);
    }

    private void configureActions() {
        getStartedButton.setOnClickListener(view -> openDashboard());
    }

    private void openDashboard() {
        Intent dashboardIntent =
                new Intent(MainActivity.this, DashboardActivity.class);

        startActivity(dashboardIntent);
    }
}
