package com.example.task01;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetDialog extends BottomSheetDialogFragment {
    private EditText editText;
    private Button button;
    private ListFragment listFragment;

    public BottomSheetDialog(Context context) {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_dialog,container,false);
        editText = view.findViewById(R.id.editText_item);
        button = view.findViewById(R.id.btn_add_item);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listFragment.onCLickBottomSheet(editText.getText().toString());
//                bottomSheetListener.onButtonClicked(editText.getText().toString());
            }
        });
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
