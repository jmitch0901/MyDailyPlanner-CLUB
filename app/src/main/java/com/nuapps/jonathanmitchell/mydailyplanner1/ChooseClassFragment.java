package com.nuapps.jonathanmitchell.mydailyplanner1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by jonathanmitchell on 10/12/15.
 */
public class ChooseClassFragment extends Fragment{

    private SchoolClassListItemAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main,container,false);

        final Button addSchoolClass = (Button)v.findViewById(R.id.button_add_school_class);
        addSchoolClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                AddClassDialogFragment dialogFragment = new AddClassDialogFragment();
                dialogFragment.setTargetFragment(ChooseClassFragment.this,0);
                dialogFragment.show(getActivity().getSupportFragmentManager(),"D FRAG");




            }
        });

        ListView classListView = (ListView)v.findViewById(R.id.list_view_school_classes);

        adapter = new SchoolClassListItemAdapter(getActivity(),
                android.R.layout.simple_list_item_1,
                SchoolClassFactory.getFactory(getActivity()).getDataStructure()
                );
        classListView.setAdapter(adapter);

        return v;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode== Activity.RESULT_OK){
            if(adapter!=null){
                adapter.notifyDataSetChanged();
            }
        }
    }
}
