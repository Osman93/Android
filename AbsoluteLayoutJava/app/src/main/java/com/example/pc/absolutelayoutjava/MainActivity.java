package com.example.pc.absolutelayoutjava;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.CheckBox;


public class MainActivity extends ActionBarActivity {
    AbsoluteLayout pnl;
    AbsoluteLayout.LayoutParams lp,lp2;
    CheckBox chk;
    Button btn;

    @SuppressWarnings("deprecation")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pnl = new AbsoluteLayout(this);
        btn = new Button(this);
        btn.setText("Button");
        chk = new CheckBox(this);
        chk.setText("CheckBox");

        lp = new AbsoluteLayout.LayoutParams(200, 50, 30, 40);
        pnl.addView(chk,lp);

        lp2=new AbsoluteLayout.LayoutParams(200,50,30,90);
        pnl.addView(btn,lp2);

        setContentView(pnl);

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
