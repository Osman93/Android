package com.example.pc.klavyemesajyakalama;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {


    @Override
    public void onBackPressed() {

        this.setTitle("Geri oka basildi");
    }

    @Override
    protected void onUserLeaveHint() {
        this.setTitle("Home");
        super.onUserLeaveHint();
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {

        switch(keyCode){

            case KeyEvent.KEYCODE_BACK:
                this.setTitle("Geri Ok");
                break;
            case KeyEvent.KEYCODE_HOME:
//Burada g�rmemiz desteklenmiyor o yuzden onUserLeaveHint() kullan�lmal�d�r.
                break;
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                this.setTitle("Ses kapa");
                break;

            case KeyEvent.KEYCODE_VOLUME_UP:
                this.setTitle("Ses ac");
                break;



        }

        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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
