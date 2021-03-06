package com.example.ilhamakbar.ilhamakbar_1202154193_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by Ilham Akbar on 18/02/2018.
 */

public class DineIn extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        //Membuat spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinner_table); //untuk mencari nomor meja

        //Membuat ArrayAdapter menggunakan array string dan layout spinner default
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tables_array, android.R.layout.simple_spinner_item);

        //Menentukan tata letak yang akan digunakan saat daftar pilihan muncul
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        //Menerapkan adaptor ke spinner
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    // method untuk mengarahkan ke aktivitas selanjutnya
    public void onClickOrder(View view) {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}
