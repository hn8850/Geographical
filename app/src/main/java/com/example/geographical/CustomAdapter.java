package com.example.geographical;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflter;
    String[] names_of_countries, names_of_capitals;
    int[] flags;

    public CustomAdapter(Context context, int[] flags, String[] names_of_countries, String[] names_of_capitals) {
        this.context = context;
        this.flags = flags;
        this.names_of_countries = names_of_countries;
        this.names_of_capitals = names_of_capitals;
        inflter = (LayoutInflater.from(context));

    }

    @Override
    public int getCount() {
        return flags.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spin, null);
        TextView capitalName = view.findViewById(R.id.capitalName);
        TextView countryName = view.findViewById(R.id.countryName);
        if (i==0) countryName.setTypeface(null, Typeface.NORMAL);
        capitalName.setText(names_of_capitals[i]);
        countryName.setText(names_of_countries[i]);
        ImageView flag = view.findViewById(R.id.flag);
        flag.setImageResource(flags[i]);
        return view;


    }
}
