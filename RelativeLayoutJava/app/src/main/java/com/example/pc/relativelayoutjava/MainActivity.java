package com.example.pc.relativelayoutjava;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {
    RelativeLayout pnl;
    RelativeLayout.LayoutParams lpA,lpB,lpC,lpD,lpF,lpE;
    Button btnA,btnB,btnC,btnD,btnF,btnE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pnl=new RelativeLayout(this);

        btnA=new Button(this);
        btnA.setText("A");
        lpA=new RelativeLayout.LayoutParams(50,65);
        lpA.addRule(RelativeLayout.ALIGN_PARENT_START);
        lpA.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        pnl.addView(btnA, lpA);

        btnB=new Button(this);
        btnB.setText("B");
        lpB=new RelativeLayout.LayoutParams(50,65);
        lpB.addRule(RelativeLayout.ALIGN_PARENT_END);
        lpB.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        pnl.addView(btnB, lpB);

        btnC=new Button(this);
        btnC.setText("C");
        lpC=new RelativeLayout.LayoutParams(50,65);
        lpC.addRule(RelativeLayout.ALIGN_PARENT_START);
        lpC.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        pnl.addView(btnC, lpC);

        btnD=new Button(this);
        btnD.setText("D");
        lpD=new RelativeLayout.LayoutParams(50,65);
        lpD.addRule(RelativeLayout.ALIGN_PARENT_END);
        lpD.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        pnl.addView(btnD, lpD);

        btnF=new Button(this);
        btnF.setText("F");
        btnF.setId(1);
        lpF=new RelativeLayout.LayoutParams(100,65);
        lpF.addRule(RelativeLayout.CENTER_VERTICAL);
        lpF.addRule(RelativeLayout.CENTER_HORIZONTAL);
        pnl.addView(btnF, lpF);

        btnE=new Button(this);
        btnE.setText("E");
        lpE=new RelativeLayout.LayoutParams(100,65);
        lpE.addRule(RelativeLayout.ABOVE,btnF.getId());
        lpE.addRule(RelativeLayout.ALIGN_START,btnF.getId());

        pnl.addView(btnE, lpE);

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
