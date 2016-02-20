package com.example.pc.linearlayoutkullanm;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity  {
    LinearLayout pnlLinear;
    Button btn;
    CheckBox chk;
    ScrollView sv;

    private void init(){
        sv=new ScrollView(this);
        pnlLinear=new LinearLayout(this);
        pnlLinear.setOrientation(LinearLayout.VERTICAL);

        for(int i=0;i<=5;i++){
            if(i%2==0){
                chk=new CheckBox(this);
                //Etiketle çagýrabilmek için Tag verildi
                chk.setTag(i);
                chk.setText("CheckBox " + (i + 1));


               //Burada geniþlik ve yükseklik deðeri verildi
                LinearLayout.LayoutParams lp1=new LinearLayout.LayoutParams(200,80);
                //Boþluklar ayarlandý
                lp1.setMargins(10,5,10,5);
                chk.setLayoutParams(lp1);

                pnlLinear.addView(chk);


            }
            else{
                btn=new Button(this);
                btn.setId(i);
                Log.e("err", String.valueOf(btn.getId()));
                btn.setText("Button " + (i + 1));
                //Burada geniþlik ve yükseklik deðeri verildi
                LinearLayout.LayoutParams lp2=new LinearLayout.LayoutParams(200,80);
                //Boþluklar ayarlandý
                lp2.setMargins(10, 5, 10, 5);

                lp2.gravity= Gravity.RIGHT;
                btn.setLayoutParams(lp2);

                pnlLinear.addView(btn);




            }


        }
        sv.addView(pnlLinear);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(sv);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((int) view.getId() == 1)
                    btn.setText("a");
                else if ((int) view.getId() == 3)
                    btn.setText("b");
                else if ((int) view.getId() == 5)
                    btn.setText("c");

            }

        });





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

