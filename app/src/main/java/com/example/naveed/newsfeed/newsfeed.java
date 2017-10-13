package com.example.naveed.newsfeed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Naveed on 8/9/2017.
 */
public class newsfeed extends BaseAdapter {

    LayoutInflater inflater;
    Context mContext;

    int [] pPic= {R.drawable.f1, R.drawable.f2, R.drawable.f3};
    String [] name=  {"Sabeeha Tanveer","Fiza Habib" , "Rabia Shabbir" };
    int [] uploads= {R.drawable.f1, R.drawable.f2, R.drawable.f3};
    String [] status = {"my name is sabeeha", "My name is fiza", "My name is rabia"};

    public newsfeed(Context mContext){
        this.mContext=mContext;
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        inflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.feed, null);

        ImageView img = (ImageView) convertView.findViewById(R.id.i1);
        TextView txt= (TextView) convertView.findViewById(R.id.t1);
        TextView txt1= (TextView) convertView.findViewById(R.id.t3);
        ImageView img1 = (ImageView) convertView.findViewById(R.id.i2);

        img.setImageResource(pPic[position]);
        txt.setText(name[position]);
        img1.setImageResource(uploads[position]);
        txt1.setText(status[position]);


        return convertView;
    }
}
