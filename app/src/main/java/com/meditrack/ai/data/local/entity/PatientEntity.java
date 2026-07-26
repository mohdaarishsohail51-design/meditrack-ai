package com.meditrack.ai.data.local.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "patients",
        indices = {
                @Index(value = {"full_name"}),
                @Index(value = {"phone_number"}),
                @Index(value = {"created_at"})
        }
)
public class PatientEntity {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "patient_id")
    private long patientId;

    @NonNull
    @ColumnInfo(name = "full_name")
    private String fullName;

    @ColumnInfo(name = "date_of_birth")
    private Long dateOfBirth;

    @NonNull
    @ColumnInfo(name = "gender")
    private String gender;

    @NonNull
    @ColumnInfo(name = "blood_group")
    private String bloodGroup;

    @NonNull
    @ColumnInfo(name = "phone_number")
    private String phoneNumber;

    @NonNull
    @ColumnInfo(name = "email_address")
    private String emailAddress;

    @NonNull
    @ColumnInfo(name = "address")
    private String address;

    @NonNull
    @ColumnInfo(name = "emergency_contact_name")
    private String emergencyContactName;

    @NonNull
    @ColumnInfo(name = "emergency_contact_phone")
    private String emergencyContactPhone;

    @NonNull
    @ColumnInfo(name = "allergies")
    private String allergies;

    @NonNull
    @ColumnInfo(name = "chronic_conditions")
    private String chronicConditions;

    @NonNull
    @ColumnInfo(name = "notes")
    private String notes;

    @ColumnInfo(name = "profile_image_uri")
    private String profileImageUri;

    @ColumnInfo(name = "created_at")
    private long createdAt;

    @ColumnInfo(name = "updated_at")
    private long updatedAt;

    public PatientEntity() {
        // Required empty constructor for Room
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    @NonNull
    public String getFullName() {
        return fullName;
    }

    public void setFullName(@NonNull String fullName) {
        this.fullName = fullName;
    }

    public Long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @NonNull
    public String getGender() {
        return gender;
    }

    public void setGender(@NonNull String gender) {
        this.gender = gender;
    }

    @NonNull
    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(@NonNull String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @NonNull
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(@NonNull String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @NonNull
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(@NonNull String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @NonNull
    public String getAddress() {
        return address;
    }

    public void setAddress(@NonNull String address) {
        this.address = address;
    }

    @NonNull
    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(@NonNull String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    @NonNull
    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(@NonNull String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    @NonNull
    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(@NonNull String allergies) {
        this.allergies = allergies;
    }

    @NonNull
    public String getChronicConditions() {
        return chronicConditions;
    }

    public void setChronicConditions(@NonNull String chronicConditions) {
        this.chronicConditions = chronicConditions;
    }

    @NonNull
    public String getNotes() {
        return notes;
    }

    public void setNotes(@NonNull String notes) {
        this.notes = notes;
    }

    public String getProfileImageUri() {
        return profileImageUri;
    }

    public void setProfileImageUri(String profileImageUri) {
        this.profileImageUri = profileImageUri;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
