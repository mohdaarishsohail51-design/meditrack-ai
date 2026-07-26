package com.meditrack.ai.data.local.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.meditrack.ai.data.local.dao.PatientDao;
import com.meditrack.ai.data.local.entity.PatientEntity;

@Database(
        entities = {
                PatientEntity.class
        },
        version = 1,
        exportSchema = true
)
public abstract class MediTrackDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "meditrack_database";

    private static volatile MediTrackDatabase instance;

    public abstract PatientDao patientDao();

    public static MediTrackDatabase getInstance(Context context) {
        if (instance == null) {
            synchronized (MediTrackDatabase.class) {
                if (instance == null) {
                    instance = Room.databaseBuilder(
                                    context.getApplicationContext(),
                                    MediTrackDatabase.class,
                                    DATABASE_NAME
                            )
                            .build();
                }
            }
        }

        return instance;
    }
}
