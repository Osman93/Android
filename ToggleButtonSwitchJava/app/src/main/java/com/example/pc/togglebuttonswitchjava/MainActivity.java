package com.example.pc.togglebuttonswitchjava;

import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    LinearLayout pnl;
    Switch swap;
    TextView txt;
    private void init(){
        pnl=new LinearLayout(this);
        pnl.setOrientation(LinearLayout.HORIZONTAL);

        swap=new Switch(this);
//Gerek yok buna
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            swap.setShowText(false);
        }



        swap.setTextOff("Kara Dalga");
        swap.setTextOn("Sinus Dalga");

        pnl.addView(swap);

        txt=new TextView(this);

        pnl.addView(txt);

    }
    private void CheckChange(){
        swap.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(swap.isChecked())
                    txt.setText(swap.getTextOn());
                else
                    txt.setText(swap.getTextOff());
            }
        });


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(pnl);
        CheckChange();

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
