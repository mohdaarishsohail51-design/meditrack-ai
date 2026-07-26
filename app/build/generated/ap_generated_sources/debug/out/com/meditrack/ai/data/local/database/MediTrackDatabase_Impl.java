package com.meditrack.ai.data.local.database;

import androidx.annotation.NonNull;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.meditrack.ai.data.local.dao.PatientDao;
import com.meditrack.ai.data.local.dao.PatientDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class MediTrackDatabase_Impl extends MediTrackDatabase {
  private volatile PatientDao _patientDao;

  @Override
  @NonNull
  protected RoomOpenDelegate createOpenDelegate() {
    final RoomOpenDelegate _openDelegate = new RoomOpenDelegate(1, "9b9096ad5865e97d89936915d865cb7d", "866b7c3977296e2eb2204a716d317b3f") {
      @Override
      public void createAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `patients` (`patient_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `full_name` TEXT NOT NULL, `date_of_birth` INTEGER, `gender` TEXT NOT NULL, `blood_group` TEXT NOT NULL, `phone_number` TEXT NOT NULL, `email_address` TEXT NOT NULL, `address` TEXT NOT NULL, `emergency_contact_name` TEXT NOT NULL, `emergency_contact_phone` TEXT NOT NULL, `allergies` TEXT NOT NULL, `chronic_conditions` TEXT NOT NULL, `notes` TEXT NOT NULL, `profile_image_uri` TEXT, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL)");
        SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_patients_full_name` ON `patients` (`full_name`)");
        SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_patients_phone_number` ON `patients` (`phone_number`)");
        SQLite.execSQL(connection, "CREATE INDEX IF NOT EXISTS `index_patients_created_at` ON `patients` (`created_at`)");
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9b9096ad5865e97d89936915d865cb7d')");
      }

      @Override
      public void dropAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "DROP TABLE IF EXISTS `patients`");
      }

      @Override
      public void onCreate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      public void onOpen(@NonNull final SQLiteConnection connection) {
        internalInitInvalidationTracker(connection);
      }

      @Override
      public void onPreMigrate(@NonNull final SQLiteConnection connection) {
        DBUtil.dropFtsSyncTriggers(connection);
      }

      @Override
      public void onPostMigrate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      @NonNull
      public RoomOpenDelegate.ValidationResult onValidateSchema(
          @NonNull final SQLiteConnection connection) {
        final Map<String, TableInfo.Column> _columnsPatients = new HashMap<String, TableInfo.Column>(16);
        _columnsPatients.put("patient_id", new TableInfo.Column("patient_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatients.put("full_name", new TableInfo.Column("full_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatients.put("date_of_birth", new TableInfo.Column("date_of_birth", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatients.put("gender", new TableInfo.Column("gender", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatients.put("blood_group", new TableInfo.Column("blood_group", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatients.put("phone_number", new TableInfo.Column("phone_number", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatients.put("email_address", new TableInfo.Column("email_address", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatients.put("address", new TableInfo.Column("address", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatients.put("emergency_contact_name", new TableInfo.Column("emergency_contact_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatients.put("emergency_contact_phone", new TableInfo.Column("emergency_contact_phone", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatients.put("allergies", new TableInfo.Column("allergies", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatients.put("chronic_conditions", new TableInfo.Column("chronic_conditions", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatients.put("notes", new TableInfo.Column("notes", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatients.put("profile_image_uri", new TableInfo.Column("profile_image_uri", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatients.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPatients.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final Set<TableInfo.ForeignKey> _foreignKeysPatients = new HashSet<TableInfo.ForeignKey>(0);
        final Set<TableInfo.Index> _indicesPatients = new HashSet<TableInfo.Index>(3);
        _indicesPatients.add(new TableInfo.Index("index_patients_full_name", false, Arrays.asList("full_name"), Arrays.asList("ASC")));
        _indicesPatients.add(new TableInfo.Index("index_patients_phone_number", false, Arrays.asList("phone_number"), Arrays.asList("ASC")));
        _indicesPatients.add(new TableInfo.Index("index_patients_created_at", false, Arrays.asList("created_at"), Arrays.asList("ASC")));
        final TableInfo _infoPatients = new TableInfo("patients", _columnsPatients, _foreignKeysPatients, _indicesPatients);
        final TableInfo _existingPatients = TableInfo.read(connection, "patients");
        if (!_infoPatients.equals(_existingPatients)) {
          return new RoomOpenDelegate.ValidationResult(false, "patients(com.meditrack.ai.data.local.entity.PatientEntity).\n"
                  + " Expected:\n" + _infoPatients + "\n"
                  + " Found:\n" + _existingPatients);
        }
        return new RoomOpenDelegate.ValidationResult(true, null);
      }
    };
    return _openDelegate;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final Map<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final Map<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "patients");
  }

  @Override
  public void clearAllTables() {
    super.performClear(false, "patients");
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final Map<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(PatientDao.class, PatientDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final Set<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public PatientDao patientDao() {
    if (_patientDao != null) {
      return _patientDao;
    } else {
      synchronized(this) {
        if(_patientDao == null) {
          _patientDao = new PatientDao_Impl(this);
        }
        return _patientDao;
      }
    }
  }
}
