package com.example.pc.tablelayoutjava;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;


public class MainActivity extends ActionBarActivity {
    TableLayout pnl;
    TableRow row;
    Button btn;
    HorizontalScrollView hsv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hsv=new HorizontalScrollView(this);
        pnl = new TableLayout(this);
        for (int i = 1; i <= 5; i++) {

            row = new TableRow(this);
            for (int j = 1; j <= 4; j++) {
                btn=new Button(this);
                btn.setText(String.format("X:%d Y:%d",i,j));
                btn.setWidth(150);
                btn.setHeight(60);
                row.addView(btn);

            }
        pnl.addView(row);
        }
        hsv.addView(pnl);
        setContentView(hsv);
//Bu kýsým satýr
        TableRow tr=(TableRow)pnl.getChildAt(0);
        //bu kýsým sütün index 0 'dan baþlýyor unutma..
        ((Button)tr.getChildAt(1)).setBackgroundColor(Color.GREEN);
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
