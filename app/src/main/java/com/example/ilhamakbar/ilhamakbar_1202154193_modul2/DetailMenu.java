package com.example.ilhamakbar.ilhamakbar_1202154193_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ilham Akbar on 18/02/2018.
 */

public class DetailMenu extends AppCompatActivity {

    //deklarasi objek
    TextView tv_food, tv_price;
    ImageView iv_photo;

    //method yang dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        Intent intent = getIntent(); // mengambil data dari activity sebeleumnya
        String food = intent.getStringExtra("food");
        Integer price = intent.getIntExtra("price",0);
        Integer photo = intent.getIntExtra("photo",0);

        Log.d("getIntExtra", ""+price+photo);

        tv_food = (TextView)findViewById(R.id.tv_detailFood);//untuk mencari detail makanan
        tv_price = (TextView)findViewById(R.id.tv_detailPrice);//untuk mencari detail harga
        iv_photo = (ImageView)findViewById(R.id.iv_detailPhoto);//untuk mencari detail gambar

        tv_food.setText(food);
        tv_price.setText("Rp. "+price);
        iv_photo.setImageResource(photo);
    }
}
