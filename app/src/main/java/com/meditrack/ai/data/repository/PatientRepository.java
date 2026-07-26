package com.meditrack.ai.data.repository;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.meditrack.ai.data.local.dao.PatientDao;
import com.meditrack.ai.data.local.database.MediTrackDatabase;
import com.meditrack.ai.data.local.entity.PatientEntity;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PatientRepository {

    public interface OperationCallback<T> {
        void onSuccess(T result);

        void onError(Exception exception);
    }

    private static final int DATABASE_THREAD_COUNT = 2;

    private final PatientDao patientDao;
    private final ExecutorService databaseExecutor;

    public PatientRepository(Context context) {
        MediTrackDatabase database =
                MediTrackDatabase.getInstance(context);

        patientDao = database.patientDao();

        databaseExecutor =
                Executors.newFixedThreadPool(DATABASE_THREAD_COUNT);
    }

    public LiveData<List<PatientEntity>> observeAllPatients() {
        return patientDao.observeAllPatients();
    }

    public LiveData<PatientEntity> observePatientById(long patientId) {
        return patientDao.observePatientById(patientId);
    }

    public LiveData<List<PatientEntity>> searchPatients(String query) {
        String safeQuery = query == null ? "" : query.trim();
        return patientDao.searchPatients(safeQuery);
    }

    public LiveData<Integer> observePatientCount() {
        return patientDao.observePatientCount();
    }

    public void insertPatient(
            PatientEntity patient,
            OperationCallback<Long> callback
    ) {
        databaseExecutor.execute(() -> {
            try {
                long patientId = patientDao.insertPatient(patient);

                if (callback != null) {
                    callback.onSuccess(patientId);
                }
            } catch (Exception exception) {
                if (callback != null) {
                    callback.onError(exception);
                }
            }
        });
    }

    public void updatePatient(
            PatientEntity patient,
            OperationCallback<Integer> callback
    ) {
        databaseExecutor.execute(() -> {
            try {
                int updatedRows = patientDao.updatePatient(patient);

                if (callback != null) {
                    callback.onSuccess(updatedRows);
                }
            } catch (Exception exception) {
                if (callback != null) {
                    callback.onError(exception);
                }
            }
        });
    }

    public void deletePatient(
            PatientEntity patient,
            OperationCallback<Integer> callback
    ) {
        databaseExecutor.execute(() -> {
            try {
                int deletedRows = patientDao.deletePatient(patient);

                if (callback != null) {
                    callback.onSuccess(deletedRows);
                }
            } catch (Exception exception) {
                if (callback != null) {
                    callback.onError(exception);
                }
            }
        });
    }

    public void deletePatientById(
            long patientId,
            OperationCallback<Integer> callback
    ) {
        databaseExecutor.execute(() -> {
            try {
                int deletedRows =
                        patientDao.deletePatientById(patientId);

                if (callback != null) {
                    callback.onSuccess(deletedRows);
                }
            } catch (Exception exception) {
                if (callback != null) {
                    callback.onError(exception);
                }
            }
        });
    }
}
