package com.example.toast;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Bu kýsýmda layout klasörü içindeki activity_main.xml dosyasýný kullanýcý için getirdik..
        
        Toast.makeText(MainActivity.this, "Toast Bildirim Mesajý", Toast.LENGTH_LONG).show();
        
        /*
         * Toast sýnýfý makeText ile kullanýcýya bildirilecek mesajý düzenlemek için kullanýlýr..
         * 
         * MainActivity.this parametresi Toast 'ý nerde kullanacaðýmýzý göstermektedir.
         * 
         * "Toast Bildirim Mesajý" kullanýcýya hangi yazýyý gösterceðimizi burda belirliyoruz yani 2.parametrede..
         * 
         * Toast.LENGTH_LONG uzun süreli mesajýn görünmesini saðlarken LENGTH_SHORT dersek daha kýsa süre ekranda kalacaktýr..
         * 
         * En son show() metodunu yazmazsanýz eðer Toast mesajýný göremezsiniz ....!!!!
         * 
         * */
    }

  
}
