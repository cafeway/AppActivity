package com.mayhem.www.startup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String msg="Android";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg,"onCreate: ");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(msg, "this activity is about to become visible: ");
    }
    //is called when an activity has become visible to the user
    @Override
    protected  void onResume(){
        super.onResume();
        Log.d(msg, "the activity is visible to the user: ");
    }

    //when activity another activity takes focus
    @Override
    protected void onPause(){
        Log.d(msg, "the activity lost focus ");
        super.onPause();
    }
    //when activity another activity is no longer visible
    @Override
    protected void onStop(){
        Log.d(msg, "the activity is not visible: ");
        super.onStop();
    }
    //called when an activity is about to be destroyed
    @Override
    protected void onDestroy(){
        Log.d(msg, "the activity is destroyed ");
        super.onDestroy();

    }

}
