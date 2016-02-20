package com.example.pc.gravityandweightjava;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    LinearLayout pnl;
    Button btn1,btn2,btn3;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pnl=new LinearLayout(this);
        pnl.setOrientation(LinearLayout.VERTICAL);

        text=new TextView(this);
        text.setText("Gravity ve Weight");
        text.setTextSize(50);
        pnl.addView(text);

        btn1=new Button(this);
        btn1.setText("New Button");
        btn1.setBackgroundColor(Color.GREEN);

        LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(100,1);
        lp.weight=0.5f;
        lp.gravity= Gravity.RIGHT;
        pnl.addView(btn1,lp);

        btn2=new Button(this);
        btn2.setText("New Button");
        btn2.setBackgroundColor(Color.BLUE);

        LinearLayout.LayoutParams lp2=new LinearLayout.LayoutParams(100,1);
        lp2.weight=0.4f;
        lp2.gravity= Gravity.CENTER_HORIZONTAL;
        pnl.addView(btn2,lp2);

        btn3=new Button(this);
        btn3.setText("New Button");
        btn3.setBackgroundColor(Color.RED);

        LinearLayout.LayoutParams lp3=new LinearLayout.LayoutParams(100,1);
        lp3.weight=0.1f;
        lp3.gravity= Gravity.LEFT;
        pnl.addView(btn3,lp3);


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
