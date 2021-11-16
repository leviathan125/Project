package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class events extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] listOfEvents = {
          "Name of Event",
          "Name of Event",
          "Name of Event",
          "Name of Event",
          "Name of Event",
          "Name of Event",
          "Name of Event",
          "Name of Event",
        }; //end of array

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_events, R.id.List_for_menu, listOfEvents));
    } //end of onCreate
} //end of class events