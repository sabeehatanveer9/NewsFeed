package com.example.naveed.newsfeed;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {


    ListView mlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mlist= (ListView) findViewById(R.id.l1);
        newsfeed cAdapter= new newsfeed(this);
        mlist.setAdapter(cAdapter);


  }



}
