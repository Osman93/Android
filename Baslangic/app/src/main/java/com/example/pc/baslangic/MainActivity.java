package com.example.pc.baslangic;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

import static java.util.Calendar.*;


public class MainActivity extends ActionBarActivity {
    Button buton;
    String time;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Button widget'tan buton isminde nesne �retildi..
        buton = new Button(this);
        //buton nesnesinin �zerindeki yaz� ismi belirlendi..
        buton.setText("Deneme Butonu");
        //butonumuzun geni�li�i bildirildi..
        buton.setWidth(200);
        //butonumuzun y�ksekli�i bildirildi..
        buton.setHeight(90);

        //�imdi butona t�klad���m�zda ne yapacak ona bakal�m..
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log kullan�m�na ili�kin burd logcat de yap�lan i�lem bilgisi i�in yap�l�yor.
                Log.i("MainActivity onClick", "Butona t�kland�"+count+" kez");
                //�uanki zaman� time ismindeki string i�inde depolad�k..
                time= Calendar.getInstance().getTime().toString();
                //Ve uygulamam�z�n ba�l���n� bu zaman yapal�m..
                MainActivity.this.setTitle(time);

                count++;
            }
        });
        //Burada bir layoutta xml uzant�l� dosyay� de�ilde butonun i�eri�ini �a��rd�k ve her buttona t�klad���m�zda activity mizin title k�sm� de�i�ecektir.
        this.setContentView(buton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
