package com.meditrack.ai.data.local.dao;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import com.meditrack.ai.data.local.entity.PatientEntity;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class PatientDao_Impl implements PatientDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<PatientEntity> __insertAdapterOfPatientEntity;

  private final EntityDeleteOrUpdateAdapter<PatientEntity> __deleteAdapterOfPatientEntity;

  private final EntityDeleteOrUpdateAdapter<PatientEntity> __updateAdapterOfPatientEntity;

  public PatientDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfPatientEntity = new EntityInsertAdapter<PatientEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `patients` (`patient_id`,`full_name`,`date_of_birth`,`gender`,`blood_group`,`phone_number`,`email_address`,`address`,`emergency_contact_name`,`emergency_contact_phone`,`allergies`,`chronic_conditions`,`notes`,`profile_image_uri`,`created_at`,`updated_at`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement, final PatientEntity entity) {
        statement.bindLong(1, entity.getPatientId());
        if (entity.getFullName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getFullName());
        }
        if (entity.getDateOfBirth() == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, entity.getDateOfBirth());
        }
        if (entity.getGender() == null) {
          statement.bindNull(4);
        } else {
          statement.bindText(4, entity.getGender());
        }
        if (entity.getBloodGroup() == null) {
          statement.bindNull(5);
        } else {
          statement.bindText(5, entity.getBloodGroup());
        }
        if (entity.getPhoneNumber() == null) {
          statement.bindNull(6);
        } else {
          statement.bindText(6, entity.getPhoneNumber());
        }
        if (entity.getEmailAddress() == null) {
          statement.bindNull(7);
        } else {
          statement.bindText(7, entity.getEmailAddress());
        }
        if (entity.getAddress() == null) {
          statement.bindNull(8);
        } else {
          statement.bindText(8, entity.getAddress());
        }
        if (entity.getEmergencyContactName() == null) {
          statement.bindNull(9);
        } else {
          statement.bindText(9, entity.getEmergencyContactName());
        }
        if (entity.getEmergencyContactPhone() == null) {
          statement.bindNull(10);
        } else {
          statement.bindText(10, entity.getEmergencyContactPhone());
        }
        if (entity.getAllergies() == null) {
          statement.bindNull(11);
        } else {
          statement.bindText(11, entity.getAllergies());
        }
        if (entity.getChronicConditions() == null) {
          statement.bindNull(12);
        } else {
          statement.bindText(12, entity.getChronicConditions());
        }
        if (entity.getNotes() == null) {
          statement.bindNull(13);
        } else {
          statement.bindText(13, entity.getNotes());
        }
        if (entity.getProfileImageUri() == null) {
          statement.bindNull(14);
        } else {
          statement.bindText(14, entity.getProfileImageUri());
        }
        statement.bindLong(15, entity.getCreatedAt());
        statement.bindLong(16, entity.getUpdatedAt());
      }
    };
    this.__deleteAdapterOfPatientEntity = new EntityDeleteOrUpdateAdapter<PatientEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `patients` WHERE `patient_id` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement, final PatientEntity entity) {
        statement.bindLong(1, entity.getPatientId());
      }
    };
    this.__updateAdapterOfPatientEntity = new EntityDeleteOrUpdateAdapter<PatientEntity>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `patients` SET `patient_id` = ?,`full_name` = ?,`date_of_birth` = ?,`gender` = ?,`blood_group` = ?,`phone_number` = ?,`email_address` = ?,`address` = ?,`emergency_contact_name` = ?,`emergency_contact_phone` = ?,`allergies` = ?,`chronic_conditions` = ?,`notes` = ?,`profile_image_uri` = ?,`created_at` = ?,`updated_at` = ? WHERE `patient_id` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement, final PatientEntity entity) {
        statement.bindLong(1, entity.getPatientId());
        if (entity.getFullName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getFullName());
        }
        if (entity.getDateOfBirth() == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, entity.getDateOfBirth());
        }
        if (entity.getGender() == null) {
          statement.bindNull(4);
        } else {
          statement.bindText(4, entity.getGender());
        }
        if (entity.getBloodGroup() == null) {
          statement.bindNull(5);
        } else {
          statement.bindText(5, entity.getBloodGroup());
        }
        if (entity.getPhoneNumber() == null) {
          statement.bindNull(6);
        } else {
          statement.bindText(6, entity.getPhoneNumber());
        }
        if (entity.getEmailAddress() == null) {
          statement.bindNull(7);
        } else {
          statement.bindText(7, entity.getEmailAddress());
        }
        if (entity.getAddress() == null) {
          statement.bindNull(8);
        } else {
          statement.bindText(8, entity.getAddress());
        }
        if (entity.getEmergencyContactName() == null) {
          statement.bindNull(9);
        } else {
          statement.bindText(9, entity.getEmergencyContactName());
        }
        if (entity.getEmergencyContactPhone() == null) {
          statement.bindNull(10);
        } else {
          statement.bindText(10, entity.getEmergencyContactPhone());
        }
        if (entity.getAllergies() == null) {
          statement.bindNull(11);
        } else {
          statement.bindText(11, entity.getAllergies());
        }
        if (entity.getChronicConditions() == null) {
          statement.bindNull(12);
        } else {
          statement.bindText(12, entity.getChronicConditions());
        }
        if (entity.getNotes() == null) {
          statement.bindNull(13);
        } else {
          statement.bindText(13, entity.getNotes());
        }
        if (entity.getProfileImageUri() == null) {
          statement.bindNull(14);
        } else {
          statement.bindText(14, entity.getProfileImageUri());
        }
        statement.bindLong(15, entity.getCreatedAt());
        statement.bindLong(16, entity.getUpdatedAt());
        statement.bindLong(17, entity.getPatientId());
      }
    };
  }

  @Override
  public long insertPatient(final PatientEntity patient) {
    return DBUtil.performBlocking(__db, false, true, (_connection) -> {
      return __insertAdapterOfPatientEntity.insertAndReturnId(_connection, patient);
    });
  }

  @Override
  public int deletePatient(final PatientEntity patient) {
    return DBUtil.performBlocking(__db, false, true, (_connection) -> {
      int _result = 0;
      _result += __deleteAdapterOfPatientEntity.handle(_connection, patient);
      return _result;
    });
  }

  @Override
  public int updatePatient(final PatientEntity patient) {
    return DBUtil.performBlocking(__db, false, true, (_connection) -> {
      int _result = 0;
      _result += __updateAdapterOfPatientEntity.handle(_connection, patient);
      return _result;
    });
  }

  @Override
  public LiveData<List<PatientEntity>> observeAllPatients() {
    final String _sql = "SELECT * FROM patients ORDER BY full_name COLLATE NOCASE ASC";
    return __db.getInvalidationTracker().createLiveData(new String[] {"patients"}, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _columnIndexOfPatientId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "patient_id");
        final int _columnIndexOfFullName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "full_name");
        final int _columnIndexOfDateOfBirth = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "date_of_birth");
        final int _columnIndexOfGender = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "gender");
        final int _columnIndexOfBloodGroup = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "blood_group");
        final int _columnIndexOfPhoneNumber = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "phone_number");
        final int _columnIndexOfEmailAddress = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "email_address");
        final int _columnIndexOfAddress = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "address");
        final int _columnIndexOfEmergencyContactName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "emergency_contact_name");
        final int _columnIndexOfEmergencyContactPhone = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "emergency_contact_phone");
        final int _columnIndexOfAllergies = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "allergies");
        final int _columnIndexOfChronicConditions = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "chronic_conditions");
        final int _columnIndexOfNotes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "notes");
        final int _columnIndexOfProfileImageUri = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "profile_image_uri");
        final int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "created_at");
        final int _columnIndexOfUpdatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "updated_at");
        final List<PatientEntity> _result = new ArrayList<PatientEntity>();
        while (_stmt.step()) {
          final PatientEntity _item;
          final String _tmpFullName;
          if (_stmt.isNull(_columnIndexOfFullName)) {
            _tmpFullName = null;
          } else {
            _tmpFullName = _stmt.getText(_columnIndexOfFullName);
          }
          final Long _tmpDateOfBirth;
          if (_stmt.isNull(_columnIndexOfDateOfBirth)) {
            _tmpDateOfBirth = null;
          } else {
            _tmpDateOfBirth = _stmt.getLong(_columnIndexOfDateOfBirth);
          }
          final String _tmpGender;
          if (_stmt.isNull(_columnIndexOfGender)) {
            _tmpGender = null;
          } else {
            _tmpGender = _stmt.getText(_columnIndexOfGender);
          }
          final String _tmpBloodGroup;
          if (_stmt.isNull(_columnIndexOfBloodGroup)) {
            _tmpBloodGroup = null;
          } else {
            _tmpBloodGroup = _stmt.getText(_columnIndexOfBloodGroup);
          }
          final String _tmpPhoneNumber;
          if (_stmt.isNull(_columnIndexOfPhoneNumber)) {
            _tmpPhoneNumber = null;
          } else {
            _tmpPhoneNumber = _stmt.getText(_columnIndexOfPhoneNumber);
          }
          final String _tmpEmailAddress;
          if (_stmt.isNull(_columnIndexOfEmailAddress)) {
            _tmpEmailAddress = null;
          } else {
            _tmpEmailAddress = _stmt.getText(_columnIndexOfEmailAddress);
          }
          final String _tmpAddress;
          if (_stmt.isNull(_columnIndexOfAddress)) {
            _tmpAddress = null;
          } else {
            _tmpAddress = _stmt.getText(_columnIndexOfAddress);
          }
          final String _tmpEmergencyContactName;
          if (_stmt.isNull(_columnIndexOfEmergencyContactName)) {
            _tmpEmergencyContactName = null;
          } else {
            _tmpEmergencyContactName = _stmt.getText(_columnIndexOfEmergencyContactName);
          }
          final String _tmpEmergencyContactPhone;
          if (_stmt.isNull(_columnIndexOfEmergencyContactPhone)) {
            _tmpEmergencyContactPhone = null;
          } else {
            _tmpEmergencyContactPhone = _stmt.getText(_columnIndexOfEmergencyContactPhone);
          }
          final String _tmpAllergies;
          if (_stmt.isNull(_columnIndexOfAllergies)) {
            _tmpAllergies = null;
          } else {
            _tmpAllergies = _stmt.getText(_columnIndexOfAllergies);
          }
          final String _tmpChronicConditions;
          if (_stmt.isNull(_columnIndexOfChronicConditions)) {
            _tmpChronicConditions = null;
          } else {
            _tmpChronicConditions = _stmt.getText(_columnIndexOfChronicConditions);
          }
          final String _tmpNotes;
          if (_stmt.isNull(_columnIndexOfNotes)) {
            _tmpNotes = null;
          } else {
            _tmpNotes = _stmt.getText(_columnIndexOfNotes);
          }
          final String _tmpProfileImageUri;
          if (_stmt.isNull(_columnIndexOfProfileImageUri)) {
            _tmpProfileImageUri = null;
          } else {
            _tmpProfileImageUri = _stmt.getText(_columnIndexOfProfileImageUri);
          }
          final long _tmpCreatedAt;
          _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
          final long _tmpUpdatedAt;
          _tmpUpdatedAt = _stmt.getLong(_columnIndexOfUpdatedAt);
          _item = new PatientEntity(_tmpFullName,_tmpDateOfBirth,_tmpGender,_tmpBloodGroup,_tmpPhoneNumber,_tmpEmailAddress,_tmpAddress,_tmpEmergencyContactName,_tmpEmergencyContactPhone,_tmpAllergies,_tmpChronicConditions,_tmpNotes,_tmpProfileImageUri,_tmpCreatedAt,_tmpUpdatedAt);
          final long _tmpPatientId;
          _tmpPatientId = _stmt.getLong(_columnIndexOfPatientId);
          _item.setPatientId(_tmpPatientId);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public LiveData<PatientEntity> observePatientById(final long patientId) {
    final String _sql = "SELECT * FROM patients WHERE patient_id = ? LIMIT 1";
    return __db.getInvalidationTracker().createLiveData(new String[] {"patients"}, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, patientId);
        final int _columnIndexOfPatientId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "patient_id");
        final int _columnIndexOfFullName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "full_name");
        final int _columnIndexOfDateOfBirth = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "date_of_birth");
        final int _columnIndexOfGender = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "gender");
        final int _columnIndexOfBloodGroup = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "blood_group");
        final int _columnIndexOfPhoneNumber = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "phone_number");
        final int _columnIndexOfEmailAddress = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "email_address");
        final int _columnIndexOfAddress = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "address");
        final int _columnIndexOfEmergencyContactName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "emergency_contact_name");
        final int _columnIndexOfEmergencyContactPhone = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "emergency_contact_phone");
        final int _columnIndexOfAllergies = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "allergies");
        final int _columnIndexOfChronicConditions = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "chronic_conditions");
        final int _columnIndexOfNotes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "notes");
        final int _columnIndexOfProfileImageUri = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "profile_image_uri");
        final int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "created_at");
        final int _columnIndexOfUpdatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "updated_at");
        final PatientEntity _result;
        if (_stmt.step()) {
          final String _tmpFullName;
          if (_stmt.isNull(_columnIndexOfFullName)) {
            _tmpFullName = null;
          } else {
            _tmpFullName = _stmt.getText(_columnIndexOfFullName);
          }
          final Long _tmpDateOfBirth;
          if (_stmt.isNull(_columnIndexOfDateOfBirth)) {
            _tmpDateOfBirth = null;
          } else {
            _tmpDateOfBirth = _stmt.getLong(_columnIndexOfDateOfBirth);
          }
          final String _tmpGender;
          if (_stmt.isNull(_columnIndexOfGender)) {
            _tmpGender = null;
          } else {
            _tmpGender = _stmt.getText(_columnIndexOfGender);
          }
          final String _tmpBloodGroup;
          if (_stmt.isNull(_columnIndexOfBloodGroup)) {
            _tmpBloodGroup = null;
          } else {
            _tmpBloodGroup = _stmt.getText(_columnIndexOfBloodGroup);
          }
          final String _tmpPhoneNumber;
          if (_stmt.isNull(_columnIndexOfPhoneNumber)) {
            _tmpPhoneNumber = null;
          } else {
            _tmpPhoneNumber = _stmt.getText(_columnIndexOfPhoneNumber);
          }
          final String _tmpEmailAddress;
          if (_stmt.isNull(_columnIndexOfEmailAddress)) {
            _tmpEmailAddress = null;
          } else {
            _tmpEmailAddress = _stmt.getText(_columnIndexOfEmailAddress);
          }
          final String _tmpAddress;
          if (_stmt.isNull(_columnIndexOfAddress)) {
            _tmpAddress = null;
          } else {
            _tmpAddress = _stmt.getText(_columnIndexOfAddress);
          }
          final String _tmpEmergencyContactName;
          if (_stmt.isNull(_columnIndexOfEmergencyContactName)) {
            _tmpEmergencyContactName = null;
          } else {
            _tmpEmergencyContactName = _stmt.getText(_columnIndexOfEmergencyContactName);
          }
          final String _tmpEmergencyContactPhone;
          if (_stmt.isNull(_columnIndexOfEmergencyContactPhone)) {
            _tmpEmergencyContactPhone = null;
          } else {
            _tmpEmergencyContactPhone = _stmt.getText(_columnIndexOfEmergencyContactPhone);
          }
          final String _tmpAllergies;
          if (_stmt.isNull(_columnIndexOfAllergies)) {
            _tmpAllergies = null;
          } else {
            _tmpAllergies = _stmt.getText(_columnIndexOfAllergies);
          }
          final String _tmpChronicConditions;
          if (_stmt.isNull(_columnIndexOfChronicConditions)) {
            _tmpChronicConditions = null;
          } else {
            _tmpChronicConditions = _stmt.getText(_columnIndexOfChronicConditions);
          }
          final String _tmpNotes;
          if (_stmt.isNull(_columnIndexOfNotes)) {
            _tmpNotes = null;
          } else {
            _tmpNotes = _stmt.getText(_columnIndexOfNotes);
          }
          final String _tmpProfileImageUri;
          if (_stmt.isNull(_columnIndexOfProfileImageUri)) {
            _tmpProfileImageUri = null;
          } else {
            _tmpProfileImageUri = _stmt.getText(_columnIndexOfProfileImageUri);
          }
          final long _tmpCreatedAt;
          _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
          final long _tmpUpdatedAt;
          _tmpUpdatedAt = _stmt.getLong(_columnIndexOfUpdatedAt);
          _result = new PatientEntity(_tmpFullName,_tmpDateOfBirth,_tmpGender,_tmpBloodGroup,_tmpPhoneNumber,_tmpEmailAddress,_tmpAddress,_tmpEmergencyContactName,_tmpEmergencyContactPhone,_tmpAllergies,_tmpChronicConditions,_tmpNotes,_tmpProfileImageUri,_tmpCreatedAt,_tmpUpdatedAt);
          final long _tmpPatientId;
          _tmpPatientId = _stmt.getLong(_columnIndexOfPatientId);
          _result.setPatientId(_tmpPatientId);
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public PatientEntity getPatientByIdSync(final long patientId) {
    final String _sql = "SELECT * FROM patients WHERE patient_id = ? LIMIT 1";
    return DBUtil.performBlocking(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, patientId);
        final int _columnIndexOfPatientId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "patient_id");
        final int _columnIndexOfFullName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "full_name");
        final int _columnIndexOfDateOfBirth = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "date_of_birth");
        final int _columnIndexOfGender = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "gender");
        final int _columnIndexOfBloodGroup = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "blood_group");
        final int _columnIndexOfPhoneNumber = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "phone_number");
        final int _columnIndexOfEmailAddress = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "email_address");
        final int _columnIndexOfAddress = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "address");
        final int _columnIndexOfEmergencyContactName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "emergency_contact_name");
        final int _columnIndexOfEmergencyContactPhone = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "emergency_contact_phone");
        final int _columnIndexOfAllergies = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "allergies");
        final int _columnIndexOfChronicConditions = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "chronic_conditions");
        final int _columnIndexOfNotes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "notes");
        final int _columnIndexOfProfileImageUri = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "profile_image_uri");
        final int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "created_at");
        final int _columnIndexOfUpdatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "updated_at");
        final PatientEntity _result;
        if (_stmt.step()) {
          final String _tmpFullName;
          if (_stmt.isNull(_columnIndexOfFullName)) {
            _tmpFullName = null;
          } else {
            _tmpFullName = _stmt.getText(_columnIndexOfFullName);
          }
          final Long _tmpDateOfBirth;
          if (_stmt.isNull(_columnIndexOfDateOfBirth)) {
            _tmpDateOfBirth = null;
          } else {
            _tmpDateOfBirth = _stmt.getLong(_columnIndexOfDateOfBirth);
          }
          final String _tmpGender;
          if (_stmt.isNull(_columnIndexOfGender)) {
            _tmpGender = null;
          } else {
            _tmpGender = _stmt.getText(_columnIndexOfGender);
          }
          final String _tmpBloodGroup;
          if (_stmt.isNull(_columnIndexOfBloodGroup)) {
            _tmpBloodGroup = null;
          } else {
            _tmpBloodGroup = _stmt.getText(_columnIndexOfBloodGroup);
          }
          final String _tmpPhoneNumber;
          if (_stmt.isNull(_columnIndexOfPhoneNumber)) {
            _tmpPhoneNumber = null;
          } else {
            _tmpPhoneNumber = _stmt.getText(_columnIndexOfPhoneNumber);
          }
          final String _tmpEmailAddress;
          if (_stmt.isNull(_columnIndexOfEmailAddress)) {
            _tmpEmailAddress = null;
          } else {
            _tmpEmailAddress = _stmt.getText(_columnIndexOfEmailAddress);
          }
          final String _tmpAddress;
          if (_stmt.isNull(_columnIndexOfAddress)) {
            _tmpAddress = null;
          } else {
            _tmpAddress = _stmt.getText(_columnIndexOfAddress);
          }
          final String _tmpEmergencyContactName;
          if (_stmt.isNull(_columnIndexOfEmergencyContactName)) {
            _tmpEmergencyContactName = null;
          } else {
            _tmpEmergencyContactName = _stmt.getText(_columnIndexOfEmergencyContactName);
          }
          final String _tmpEmergencyContactPhone;
          if (_stmt.isNull(_columnIndexOfEmergencyContactPhone)) {
            _tmpEmergencyContactPhone = null;
          } else {
            _tmpEmergencyContactPhone = _stmt.getText(_columnIndexOfEmergencyContactPhone);
          }
          final String _tmpAllergies;
          if (_stmt.isNull(_columnIndexOfAllergies)) {
            _tmpAllergies = null;
          } else {
            _tmpAllergies = _stmt.getText(_columnIndexOfAllergies);
          }
          final String _tmpChronicConditions;
          if (_stmt.isNull(_columnIndexOfChronicConditions)) {
            _tmpChronicConditions = null;
          } else {
            _tmpChronicConditions = _stmt.getText(_columnIndexOfChronicConditions);
          }
          final String _tmpNotes;
          if (_stmt.isNull(_columnIndexOfNotes)) {
            _tmpNotes = null;
          } else {
            _tmpNotes = _stmt.getText(_columnIndexOfNotes);
          }
          final String _tmpProfileImageUri;
          if (_stmt.isNull(_columnIndexOfProfileImageUri)) {
            _tmpProfileImageUri = null;
          } else {
            _tmpProfileImageUri = _stmt.getText(_columnIndexOfProfileImageUri);
          }
          final long _tmpCreatedAt;
          _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
          final long _tmpUpdatedAt;
          _tmpUpdatedAt = _stmt.getLong(_columnIndexOfUpdatedAt);
          _result = new PatientEntity(_tmpFullName,_tmpDateOfBirth,_tmpGender,_tmpBloodGroup,_tmpPhoneNumber,_tmpEmailAddress,_tmpAddress,_tmpEmergencyContactName,_tmpEmergencyContactPhone,_tmpAllergies,_tmpChronicConditions,_tmpNotes,_tmpProfileImageUri,_tmpCreatedAt,_tmpUpdatedAt);
          final long _tmpPatientId;
          _tmpPatientId = _stmt.getLong(_columnIndexOfPatientId);
          _result.setPatientId(_tmpPatientId);
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public LiveData<List<PatientEntity>> searchPatients(final String query) {
    final String _sql = "SELECT * FROM patients WHERE full_name LIKE '%' || ? || '%' OR phone_number LIKE '%' || ? || '%' ORDER BY full_name COLLATE NOCASE ASC";
    return __db.getInvalidationTracker().createLiveData(new String[] {"patients"}, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        if (query == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindText(_argIndex, query);
        }
        _argIndex = 2;
        if (query == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindText(_argIndex, query);
        }
        final int _columnIndexOfPatientId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "patient_id");
        final int _columnIndexOfFullName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "full_name");
        final int _columnIndexOfDateOfBirth = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "date_of_birth");
        final int _columnIndexOfGender = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "gender");
        final int _columnIndexOfBloodGroup = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "blood_group");
        final int _columnIndexOfPhoneNumber = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "phone_number");
        final int _columnIndexOfEmailAddress = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "email_address");
        final int _columnIndexOfAddress = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "address");
        final int _columnIndexOfEmergencyContactName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "emergency_contact_name");
        final int _columnIndexOfEmergencyContactPhone = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "emergency_contact_phone");
        final int _columnIndexOfAllergies = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "allergies");
        final int _columnIndexOfChronicConditions = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "chronic_conditions");
        final int _columnIndexOfNotes = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "notes");
        final int _columnIndexOfProfileImageUri = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "profile_image_uri");
        final int _columnIndexOfCreatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "created_at");
        final int _columnIndexOfUpdatedAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "updated_at");
        final List<PatientEntity> _result = new ArrayList<PatientEntity>();
        while (_stmt.step()) {
          final PatientEntity _item;
          final String _tmpFullName;
          if (_stmt.isNull(_columnIndexOfFullName)) {
            _tmpFullName = null;
          } else {
            _tmpFullName = _stmt.getText(_columnIndexOfFullName);
          }
          final Long _tmpDateOfBirth;
          if (_stmt.isNull(_columnIndexOfDateOfBirth)) {
            _tmpDateOfBirth = null;
          } else {
            _tmpDateOfBirth = _stmt.getLong(_columnIndexOfDateOfBirth);
          }
          final String _tmpGender;
          if (_stmt.isNull(_columnIndexOfGender)) {
            _tmpGender = null;
          } else {
            _tmpGender = _stmt.getText(_columnIndexOfGender);
          }
          final String _tmpBloodGroup;
          if (_stmt.isNull(_columnIndexOfBloodGroup)) {
            _tmpBloodGroup = null;
          } else {
            _tmpBloodGroup = _stmt.getText(_columnIndexOfBloodGroup);
          }
          final String _tmpPhoneNumber;
          if (_stmt.isNull(_columnIndexOfPhoneNumber)) {
            _tmpPhoneNumber = null;
          } else {
            _tmpPhoneNumber = _stmt.getText(_columnIndexOfPhoneNumber);
          }
          final String _tmpEmailAddress;
          if (_stmt.isNull(_columnIndexOfEmailAddress)) {
            _tmpEmailAddress = null;
          } else {
            _tmpEmailAddress = _stmt.getText(_columnIndexOfEmailAddress);
          }
          final String _tmpAddress;
          if (_stmt.isNull(_columnIndexOfAddress)) {
            _tmpAddress = null;
          } else {
            _tmpAddress = _stmt.getText(_columnIndexOfAddress);
          }
          final String _tmpEmergencyContactName;
          if (_stmt.isNull(_columnIndexOfEmergencyContactName)) {
            _tmpEmergencyContactName = null;
          } else {
            _tmpEmergencyContactName = _stmt.getText(_columnIndexOfEmergencyContactName);
          }
          final String _tmpEmergencyContactPhone;
          if (_stmt.isNull(_columnIndexOfEmergencyContactPhone)) {
            _tmpEmergencyContactPhone = null;
          } else {
            _tmpEmergencyContactPhone = _stmt.getText(_columnIndexOfEmergencyContactPhone);
          }
          final String _tmpAllergies;
          if (_stmt.isNull(_columnIndexOfAllergies)) {
            _tmpAllergies = null;
          } else {
            _tmpAllergies = _stmt.getText(_columnIndexOfAllergies);
          }
          final String _tmpChronicConditions;
          if (_stmt.isNull(_columnIndexOfChronicConditions)) {
            _tmpChronicConditions = null;
          } else {
            _tmpChronicConditions = _stmt.getText(_columnIndexOfChronicConditions);
          }
          final String _tmpNotes;
          if (_stmt.isNull(_columnIndexOfNotes)) {
            _tmpNotes = null;
          } else {
            _tmpNotes = _stmt.getText(_columnIndexOfNotes);
          }
          final String _tmpProfileImageUri;
          if (_stmt.isNull(_columnIndexOfProfileImageUri)) {
            _tmpProfileImageUri = null;
          } else {
            _tmpProfileImageUri = _stmt.getText(_columnIndexOfProfileImageUri);
          }
          final long _tmpCreatedAt;
          _tmpCreatedAt = _stmt.getLong(_columnIndexOfCreatedAt);
          final long _tmpUpdatedAt;
          _tmpUpdatedAt = _stmt.getLong(_columnIndexOfUpdatedAt);
          _item = new PatientEntity(_tmpFullName,_tmpDateOfBirth,_tmpGender,_tmpBloodGroup,_tmpPhoneNumber,_tmpEmailAddress,_tmpAddress,_tmpEmergencyContactName,_tmpEmergencyContactPhone,_tmpAllergies,_tmpChronicConditions,_tmpNotes,_tmpProfileImageUri,_tmpCreatedAt,_tmpUpdatedAt);
          final long _tmpPatientId;
          _tmpPatientId = _stmt.getLong(_columnIndexOfPatientId);
          _item.setPatientId(_tmpPatientId);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public LiveData<Integer> observePatientCount() {
    final String _sql = "SELECT COUNT(*) FROM patients";
    return __db.getInvalidationTracker().createLiveData(new String[] {"patients"}, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final Integer _result;
        if (_stmt.step()) {
          final Integer _tmp;
          if (_stmt.isNull(0)) {
            _tmp = null;
          } else {
            _tmp = (int) (_stmt.getLong(0));
          }
          _result = _tmp;
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public int deletePatientById(final long patientId) {
    final String _sql = "DELETE FROM patients WHERE patient_id = ?";
    return DBUtil.performBlocking(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, patientId);
        _stmt.step();
        return SQLiteConnectionUtil.getTotalChangedRows(_connection);
      } finally {
        _stmt.close();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
