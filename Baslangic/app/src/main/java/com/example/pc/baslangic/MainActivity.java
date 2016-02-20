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
        //Button widget'tan buton isminde nesne üretildi..
        buton = new Button(this);
        //buton nesnesinin üzerindeki yazý ismi belirlendi..
        buton.setText("Deneme Butonu");
        //butonumuzun geniþliði bildirildi..
        buton.setWidth(200);
        //butonumuzun yüksekliði bildirildi..
        buton.setHeight(90);

        //Þimdi butona týkladýðýmýzda ne yapacak ona bakalým..
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log kullanýmýna iliþkin burd logcat de yapýlan iþlem bilgisi için yapýlýyor.
                Log.i("MainActivity onClick", "Butona týklandý"+count+" kez");
                //þuanki zamaný time ismindeki string içinde depoladýk..
                time= Calendar.getInstance().getTime().toString();
                //Ve uygulamamýzýn baþlýðýný bu zaman yapalým..
                MainActivity.this.setTitle(time);

                count++;
            }
        });
        //Burada bir layoutta xml uzantýlý dosyayý deðilde butonun içeriðini çaðýrdýk ve her buttona týkladýðýmýzda activity mizin title kýsmý deðiþecektir.
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
