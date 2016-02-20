package com.example.pc.activityyasam;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("csd","onResume activity stackte ön planda");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("csd", "onPause activity stackte arka planda");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("csd", "onStart activity baþlatýldý");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("csd", "onDestroy activity nesnesi yok edildi");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("csd", "onStop activity dururuldu");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("csd", "onCreate activity nesnesi oluþturuldu");
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
