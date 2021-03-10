package com.example.a18020331_nguyenxuanhai_baitap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridGoods;
    CustomGoodsAdapter customGoodsAdapter;
    ArrayList<Goods> goodsArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridGoods = findViewById(R.id.gridGoods);

        goodsArrayList = new ArrayList<>();
        goodsArrayList.add(new Goods("GOOGLE", R.drawable.google, "80$"));
        goodsArrayList.add(new Goods("GOOGLE", R.drawable.yellow_google, "80$"));
        goodsArrayList.add(new Goods("GOOGLE", R.drawable.images, "80$"));
        goodsArrayList.add(new Goods("GOOGLE", R.drawable.google, "80$"));

        customGoodsAdapter = new CustomGoodsAdapter(MainActivity.this, R.layout.listview_items, goodsArrayList);

        gridGoods.setAdapter(customGoodsAdapter);
    }
}