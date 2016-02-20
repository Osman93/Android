package com.example.pc.resourcesgetirmejava;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    LinearLayout pnl;
    TextView txt1,txt2,txt3,txt4,txt5;
    private void init(){
        pnl=new LinearLayout(this);
        pnl.setOrientation(LinearLayout.VERTICAL);

        txt1=new TextView(this);
        txt2=new TextView(this);
        txt3=new TextView(this);
        txt4=new TextView(this);
        txt5=new TextView(this);

        pnl.addView(txt1);
        pnl.addView(txt2);
        pnl.addView(txt3);
        pnl.addView(txt4);
        pnl.addView(txt5);

        setContentView(pnl);






    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();

        Resources res=this.getResources();
        txt1.setText(res.getString(R.string.save));

        int nums[]=res.getIntArray(R.array.number);
        int toplam=0;
        for(int i=0;i<nums.length;i++){
            toplam+=nums[i];
        }
        txt2.setText(String.valueOf(toplam));

        String ct[]=res.getStringArray(R.array.cities);
        txt3.setText(ct[0]);
        txt4.setText(ct[1]);

        txt5.setText(getString(R.string.name));
        txt5.setTextAppearance(this,R.style.text);


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
