package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class home extends ListActivity {

    Integer[] activities = {
        R.drawable.reach_logo,
        R.drawable.reach_logo,
        R.drawable.reach_logo,
        R.drawable.reach_logo,
        R.drawable.reach_logo,
        R.drawable.reach_logo
    };

    String[] activity_name = {
        "Logo",
        "Logo",
        "Logo",
        "Logo",
        "Logo",
        "Logo"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

    } //end of onCreate


} //end of class