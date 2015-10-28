package com.nuapps.jonathanmitchell.mydailyplanner1;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_container);

        ChooseClassFragment myFrag = new ChooseClassFragment();
        FragmentManager myMan = getSupportFragmentManager();
        FragmentTransaction myTransaction = myMan.beginTransaction();
        myTransaction.add(R.id.fragment_bucket,myFrag);
        myTransaction.commit();


    }
}
