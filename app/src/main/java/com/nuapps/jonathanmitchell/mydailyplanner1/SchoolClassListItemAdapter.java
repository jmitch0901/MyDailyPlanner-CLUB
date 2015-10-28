package com.nuapps.jonathanmitchell.mydailyplanner1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jonathanmitchell on 10/12/15.
 */
public class SchoolClassListItemAdapter extends ArrayAdapter<SchoolClass> {

    public SchoolClassListItemAdapter(Context context, int resource, ArrayList<SchoolClass> dataStructure) {
        super(context, resource, dataStructure);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.list_item_school_class,parent,false);

        TextView classNameTextView = (TextView)v.findViewById(R.id.text_view_list_item_class);
        TextView teacherNameTextView = (TextView)v.findViewById(R.id.text_view_list_item_teacher);

        SchoolClass schoolClass = getItem(position);

        classNameTextView.setText(schoolClass.getClassName());
        teacherNameTextView.setText(schoolClass.getTeacherName());


        return v;
    }
}
