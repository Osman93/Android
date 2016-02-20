package com.example.rotate;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	TextView txt;
	 Handler handle = null;
	 Runnable runnable = null;
	 int zaman,i=0;
	
	 
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.activity_main);
	 
	  txt = (TextView) findViewById(R.id.text);
	   txt.setText("aaaaaaaaaa");
	 
	  zaman = 10;
	  handle = new Handler();
	  runnable = new Runnable() {
	 
	   @Override
	   public void run() {
	 
	    
	    if (zaman != 0) {
	    	i+=30;
	 txt.setRotation(i);
	     zaman--;
	    } else {
	     handle.removeCallbacks(runnable);
	     Toast.makeText(MainActivity.this, "zaman doldu!",
	       Toast.LENGTH_SHORT).show();
	      
	    }
	    handle.postDelayed(runnable, 1000);
	 
	   }

	
	 
	  };
	  
	 }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
