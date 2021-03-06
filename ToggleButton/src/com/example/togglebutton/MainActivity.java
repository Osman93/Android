package com.example.togglebutton;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ToggleButton;


public class MainActivity extends Activity {
EditText edit;
ToggleButton tb1,tb2;
String control;
Typeface face1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        edit=(EditText)findViewById(R.id.editText1);
        tb1=(ToggleButton)findViewById(R.id.toggleButton1);
        tb2=(ToggleButton)findViewById(R.id.toggleButton2);
        
        face1=Typeface.createFromAsset(getAssets(), "fonts/citycontrasts.ttf");
        tb2.setTypeface(face1);
        
   edit.setOnKeyListener(new View.OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
			if((event.getAction()==KeyEvent.ACTION_DOWN)&&(keyCode==KeyEvent.KEYCODE_ENTER)){
				control=edit.getText().toString();
				if(control.equals("1"))
					tb1.setChecked(true);
				else if(control.equals("0"))
					tb1.setChecked(false);
				return true;
			}else
				return false;
			}
		});
        tb2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			boolean on_off=((ToggleButton)v).isChecked();
			if(on_off){
				
				edit.setText("Hey Naber:D");
			}
			else{
				
				edit.setText("Beni kapattılar:S");
				
			}
			}
		});
        
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
