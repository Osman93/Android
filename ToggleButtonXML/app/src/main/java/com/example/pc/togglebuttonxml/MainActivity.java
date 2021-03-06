package com.example.pc.togglebuttonxml;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity {
    public void tbStartStop(View v){
        ToggleButton tb=(ToggleButton)v;
        //Burada tb.getParent() ile LinearLayouta ulaşılıp rengi değitirilmiştir...
        LinearLayout pnl=(LinearLayout)tb.getParent();
        if(tb.isChecked()){

            pnl.setBackgroundColor(Color.BLUE);
        }else{

            pnl.setBackgroundColor(Color.RED);

        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
