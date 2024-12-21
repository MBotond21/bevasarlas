package com.example.bevasarlas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    private List<Product> products;
    private Context context;

    public CustomAdapter(List<Product> products, Context context) {
        this.products = products;
        this.context = context;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.custom_row, viewGroup, false);

        TextView name = view.findViewById(R.id.nameText);
        TextView ar = view.findViewById(R.id.arText);
        TextView db = view.findViewById(R.id.dbText);
        TextView kat = view.findViewById(R.id.katText);

        Product p = products.get(i);
        name.setText(p.getNev());
        ar.setText(p.getKategoria() + " Ft");
        db.setText(p.getDarab_ar() + " db");
        kat.setText(String.valueOf(p.getMennyiseg()));

        return view;
    }
}
