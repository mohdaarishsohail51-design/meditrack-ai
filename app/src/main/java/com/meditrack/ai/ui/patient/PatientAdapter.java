package com.meditrack.ai.ui.patient;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.meditrack.ai.R;
import com.meditrack.ai.data.local.entity.PatientEntity;

public class PatientAdapter extends ListAdapter<PatientEntity, PatientAdapter.PatientViewHolder> {

    public PatientAdapter() {
        super(DIFF_CALLBACK);
    }

    private static final DiffUtil.ItemCallback<PatientEntity> DIFF_CALLBACK =
            new DiffUtil.ItemCallback<PatientEntity>() {
                @Override
                public boolean areItemsTheSame(@NonNull PatientEntity oldItem,
                                               @NonNull PatientEntity newItem) {
                    return oldItem.getPatientId() == newItem.getPatientId();
                }

                @Override
                public boolean areContentsTheSame(@NonNull PatientEntity oldItem,
                                                  @NonNull PatientEntity newItem) {
                    return oldItem.getFullName().equals(newItem.getFullName())
                            && oldItem.getPhoneNumber().equals(newItem.getPhoneNumber());
                }
            };

    @NonNull
    @Override
    public PatientViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_patient, parent, false);

        return new PatientViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PatientViewHolder holder, int position) {

        PatientEntity patient = getItem(position);

        holder.txtName.setText(patient.getFullName());
        holder.txtPhone.setText(patient.getPhoneNumber());
    }

    static class PatientViewHolder extends RecyclerView.ViewHolder {

        TextView txtName;
        TextView txtPhone;

        public PatientViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtPatientName);
            txtPhone = itemView.findViewById(R.id.txtPatientPhone);
        }
    }
}
