package com.example.pc.toastcustomjava;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    LinearLayout pnl1;
    Button btn;
    private void init(){
        pnl1=new LinearLayout(this);
        btn=new Button(this);
        btn.setText("Custom button göster");

        pnl1.addView(btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomToast("NABER","Ayý");
            }
        });



    }


    public void CustomToast(String title,String message){
        Toast t=new Toast(this);

        LinearLayout pnl=new LinearLayout(this);
        pnl.setOrientation(LinearLayout.VERTICAL);
        pnl.setBackgroundColor(Color.YELLOW);

        LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(200,50);
        lp.setMargins(5, 5, 5, 5);

        TextView tt=new TextView(this);
        tt.setText(title);
        tt.setTextColor(Color.RED);
        pnl.addView(tt, lp);

        TextView tm=new TextView(this);
        tm.setText(message);
        tm.setTextColor(Color.BLACK);
        pnl.addView(tm, lp);

        t.setDuration(Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.setView(pnl);
        t.show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(pnl1);
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
