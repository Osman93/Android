package com.example.pc.osmanandroidbaslangic;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static com.example.pc.osmanandroidbaslangic.R.layout.activity_splash;

public class SplashSceen extends ActionBarActivity implements View.OnClickListener {
    TextView text;
    String colr;
    Button inc, dec;
    int count = 0;
    Random rand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rand = new Random();
        text = (TextView) findViewById(R.id.textOsman);
        text.setTextSize(30);
        inc = (Button) findViewById(R.id.bInc);
        dec = (Button) findViewById(R.id.bDec);

        inc.setOnClickListener(this);
        dec.setOnClickListener(this);


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
        if (id == R.id.osman) {

            text.setText("Osman Asar");
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bInc:

                text.setText("Your number is " + count);
                count++;
                text.setTextColor(Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
                break;
            case R.id.bDec:
                text.setText("Your number is " + count);
                count--;
                text.setTextColor(Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
                break;


        }
    }
}

