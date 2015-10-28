package com.nuapps.jonathanmitchell.mydailyplanner1;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by jonathanmitchell on 10/12/15.
 */
public class SchoolClassFactory {

    private static SchoolClassFactory myFactory;

    private Context context;
    private ArrayList<SchoolClass> myClasses;

    private SchoolClassFactory(Context context){
        this.context=context;
        myClasses=new ArrayList<>();
    }

    public static SchoolClassFactory getFactory(Context context){
        if(myFactory==null){
            myFactory=new SchoolClassFactory(context);
        }

        return myFactory;
    }

    public void add(SchoolClass newSchoolClass){
        myClasses.add(newSchoolClass);
        Log.i("My Data: ",toString());

    }

    public ArrayList<SchoolClass> getDataStructure(){
        return myClasses;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < myClasses.size(); i++){
            s+=myClasses.get(i)+"\n";
        }

        return s;
    }
}
