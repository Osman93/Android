package com.example.toast;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Bu k�s�mda layout klas�r� i�indeki activity_main.xml dosyas�n� kullan�c� i�in getirdik..
        
        Toast.makeText(MainActivity.this, "Toast Bildirim Mesaj�", Toast.LENGTH_LONG).show();
        
        /*
         * Toast s�n�f� makeText ile kullan�c�ya bildirilecek mesaj� d�zenlemek i�in kullan�l�r..
         * 
         * MainActivity.this parametresi Toast '� nerde kullanaca��m�z� g�stermektedir.
         * 
         * "Toast Bildirim Mesaj�" kullan�c�ya hangi yaz�y� g�sterce�imizi burda belirliyoruz yani 2.parametrede..
         * 
         * Toast.LENGTH_LONG uzun s�reli mesaj�n g�r�nmesini sa�larken LENGTH_SHORT dersek daha k�sa s�re ekranda kalacakt�r..
         * 
         * En son show() metodunu yazmazsan�z e�er Toast mesaj�n� g�remezsiniz ....!!!!
         * 
         * */
    }

  
}
