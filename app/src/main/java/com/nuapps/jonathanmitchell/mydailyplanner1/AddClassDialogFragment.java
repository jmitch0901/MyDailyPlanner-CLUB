package com.nuapps.jonathanmitchell.mydailyplanner1;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by jonathanmitchell on 10/12/15.
 */
public class AddClassDialogFragment extends DialogFragment {


    private EditText classNameEditText;
    private EditText teacherNameEditText;
    private Button confirm;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_fragment_add_class,container,false);

        classNameEditText=(EditText)v.findViewById(R.id.edit_text_class_name);
        teacherNameEditText=(EditText)v.findViewById(R.id.edit_text_teacher_name);
        confirm=(Button)v.findViewById(R.id.button_confirm_add_class);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SchoolClass inputtedSchoolClass = new SchoolClass(classNameEditText.getText().toString(),
                        teacherNameEditText.getText().toString());
                SchoolClassFactory.getFactory(getActivity()).add(inputtedSchoolClass);
                getTargetFragment().onActivityResult(0, Activity.RESULT_OK,null);
                dismiss();
            }
        });

        return v;
    }
}
