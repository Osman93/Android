package com.example.pc.tablelayoutjava2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;


public class MainActivity extends ActionBarActivity {
    TableLayout pnl;
    TableRow row;
    Button btn,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pnl=new TableLayout(this);
        row=new TableRow(this);
        btn=new Button(this);
        btn.setText("Osman");
        btn2=new Button(this);
        btn2.setText("Aþar");

        TableRow.LayoutParams lp=new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,90);
        //cocuðun kolon indeksini belirler.
        lp.column=0;
        //Kaç adet sütunu olacaðýný belirler.
        lp.span=1;

        lp.gravity= Gravity.RIGHT;
        btn.setLayoutParams(lp);
        row.addView(btn);
        pnl.addView(row);
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
