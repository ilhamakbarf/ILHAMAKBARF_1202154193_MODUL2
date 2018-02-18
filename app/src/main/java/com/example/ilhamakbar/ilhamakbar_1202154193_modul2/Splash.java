package com.example.ilhamakbar.ilhamakbar_1202154193_modul2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

/**
 * Created by Ilham Akbar on 18/02/2018.
 */

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toast.makeText(this, "Ilham Akbar Fitriansah_1202154193", Toast.LENGTH_SHORT).show(); //akan menampilkan isi pesan toast
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            // method untuk mengarahkan ke aktivitas selanjutnya
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class)); //menunjukkan kelas berikutnya setelah splash
                finish();
            }
        }, 4000L); //4000 L = 4 detik
    }
}
