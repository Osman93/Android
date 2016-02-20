package com.example.pc.xmlcagrisijava;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout root=new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);

        Button child1=new Button(this);
        child1.setText("Buton");
        child1.setWidth(200);
        child1.setHeight(50);
        root.addView(child1);

        CheckBox child2=new CheckBox(this);
        child2.setText("CheckBox");
        child2.setWidth(200);
        child2.setHeight(50);
        root.addView(child2);

        TextView child3=new TextView(this);
        child3.setText("TextView");
        child3.setWidth(200);
        child3.setHeight(50);
        root.addView(child3);

        this.setContentView(root);
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
