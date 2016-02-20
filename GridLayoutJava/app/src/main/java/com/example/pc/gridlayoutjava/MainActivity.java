package com.example.pc.gridlayoutjava;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.GridLayout;


public class MainActivity extends ActionBarActivity {
    GridLayout pnl;
    Button btn;
    private void init(){
        pnl=new GridLayout(this);
       // pnl.setOrientation(GridLayout.VERTICAL);//satýr
        pnl.setOrientation(GridLayout.HORIZONTAL);//sütun
        pnl.setColumnCount(4);
        pnl.setRowCount(3);

        for(int i=0;i<12;i++){
            btn=new Button(this);
            btn.setText("Grid "+i);
            btn.setWidth(120);
            btn.setHeight(90);

            pnl.addView(btn);

        }



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
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
