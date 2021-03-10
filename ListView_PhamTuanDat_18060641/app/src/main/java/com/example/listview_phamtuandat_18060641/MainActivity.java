package com.example.listview_phamtuandat_18060641;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

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
        goodsArrayList.add(new Goods("Android", R.drawable.yellow_google, "80$"));
        goodsArrayList.add(new Goods("GOOGLE", R.drawable.computer, "80$"));
        goodsArrayList.add(new Goods("Android", R.drawable.google, "80$"));
        goodsArrayList.add(new Goods("Andoird", R.drawable.dev, "80$"));
        goodsArrayList.add(new Goods("GOOGLE", R.drawable.yellow_google, "80$"));
        goodsArrayList.add(new Goods("Dev", R.drawable.images, "80$"));
        goodsArrayList.add(new Goods("GOOGLE", R.drawable.download, "80$"));

        customGoodsAdapter = new CustomGoodsAdapter(this, R.layout.listview_items, goodsArrayList);

        gridGoods.setAdapter(customGoodsAdapter);
    }
}