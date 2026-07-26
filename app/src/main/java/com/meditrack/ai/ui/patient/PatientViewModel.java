package com.meditrack.ai.ui.patient;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.meditrack.ai.data.local.entity.PatientEntity;
import com.meditrack.ai.data.repository.PatientRepository;

import java.util.List;

public class PatientViewModel extends AndroidViewModel {

    private final PatientRepository repository;
    private final LiveData<List<PatientEntity>> allPatients;
    private final LiveData<Integer> patientCount;

    public PatientViewModel(@NonNull Application application) {
        super(application);

        repository = new PatientRepository(application);

        allPatients = repository.observeAllPatients();
        patientCount = repository.observePatientCount();
    }

    public LiveData<List<PatientEntity>> getAllPatients() {
        return allPatients;
    }

    public LiveData<Integer> getPatientCount() {
        return patientCount;
    }

    public LiveData<List<PatientEntity>> searchPatients(String query) {
        return repository.searchPatients(query);
    }

    public void insertPatient(
            PatientEntity patient,
            PatientRepository.OperationCallback<Long> callback
    ) {
        repository.insertPatient(patient, callback);
    }

    public void updatePatient(
            PatientEntity patient,
            PatientRepository.OperationCallback<Integer> callback
    ) {
        repository.updatePatient(patient, callback);
    }

    public void deletePatient(
            PatientEntity patient,
            PatientRepository.OperationCallback<Integer> callback
    ) {
        repository.deletePatient(patient, callback);
    }

    public void deletePatientById(
            long patientId,
            PatientRepository.OperationCallback<Integer> callback
    ) {
        repository.deletePatientById(patientId, callback);
    }

    public LiveData<PatientEntity> getPatientById(long patientId) {
        return repository.observePatientById(patientId);
    }
}
