package com.meditrack.ai.data.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.meditrack.ai.data.local.entity.PatientEntity;

import java.util.List;

@Dao
public interface PatientDao {

    @Insert
    long insertPatient(PatientEntity patient);

    @Update
    int updatePatient(PatientEntity patient);

    @Delete
    int deletePatient(PatientEntity patient);

    @Query(
            "SELECT * FROM patients " +
            "ORDER BY full_name COLLATE NOCASE ASC"
    )
    LiveData<List<PatientEntity>> observeAllPatients();

    @Query(
            "SELECT * FROM patients " +
            "WHERE patient_id = :patientId " +
            "LIMIT 1"
    )
    LiveData<PatientEntity> observePatientById(long patientId);

    @Query(
            "SELECT * FROM patients " +
            "WHERE patient_id = :patientId " +
            "LIMIT 1"
    )
    PatientEntity getPatientByIdSync(long patientId);

    @Query(
            "SELECT * FROM patients " +
            "WHERE full_name LIKE '%' || :query || '%' " +
            "OR phone_number LIKE '%' || :query || '%' " +
            "ORDER BY full_name COLLATE NOCASE ASC"
    )
    LiveData<List<PatientEntity>> searchPatients(String query);

    @Query("SELECT COUNT(*) FROM patients")
    LiveData<Integer> observePatientCount();

    @Query("DELETE FROM patients WHERE patient_id = :patientId")
    int deletePatientById(long patientId);
}
