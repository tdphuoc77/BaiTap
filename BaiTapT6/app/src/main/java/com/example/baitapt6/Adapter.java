package com.example.baitapt6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<Good> arr;

    public Adapter(MainActivity mainActivity, int list_view_item, ArrayList<Good> arr) {
    }

    @Override
    public int getCount() {
        return arr.size();
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
        convertView = LayoutInflater.from(context).inflate(layout, parent, false);

        ImageView img = convertView.findViewById(R.id.img);
        TextView tvName = convertView.findViewById(R.id.name);
        TextView tvPrice = convertView.findViewById(R.id.price);

        img.setImageResource(arr.get(position).getImage());
        tvName.setText(arr.get(position).getName());
        tvPrice.setText("$" + arr.get(position).getPrice());

        return convertView;
    }
}
