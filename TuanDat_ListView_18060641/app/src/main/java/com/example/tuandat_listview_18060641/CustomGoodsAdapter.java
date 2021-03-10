package com.example.a18020331_nguyenxuanhai_baitap;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter {

    public CustomGoodsAdapter(Context ctx, int layoutItems, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItems = layoutItems;
        this.arrayList = arrayList;
    }

    Context ctx;
    int layoutItems;
    ArrayList<Goods> arrayList;
    @Override
    public int getCount() {
        return arrayList.size();
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
        view = LayoutInflater.from(ctx).inflate(layoutItems, viewGroup, false);
        TextView tvName = view.findViewById(R.id.txtName);
        TextView tvPrice = view.findViewById(R.id.txtPrice);
        ImageView imageGoods = view.findViewById(R.id.imageView);

        tvName.setText(arrayList.get(i).getName());
        tvPrice.setText(arrayList.get(i).getPrice());
        imageGoods.setImageResource(arrayList.get(i).getImageGoods());
        return view;
    }
}
