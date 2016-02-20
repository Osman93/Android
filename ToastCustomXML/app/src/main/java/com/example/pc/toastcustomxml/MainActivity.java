package com.example.pc.toastcustomxml;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity {
    Button btn;
    private void init(){
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomToast("Naber?","Osman Aþar");
            }
        });


    }
    public void CustomToast(String title,String message){
        Toast t=new Toast(this);
        LayoutInflater li=this.getLayoutInflater();
        View v=li.inflate(R.layout.custom_toast, null);

        FrameLayout pnl=(FrameLayout)v;
        LinearLayout pnlInner=(LinearLayout)v.findViewById(R.id.pnlOut).findViewById(R.id.pnlIn);

        TextView tt=(TextView)pnlInner.findViewById(R.id.textTitle);
        tt.setText(title);

        TextView tm=(TextView)pnlInner.findViewById(R.id.textMessage);
        tm.setText(message);

        t.setView(pnl);
        t.show();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

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
