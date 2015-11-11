package com.example.button;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
Button b1,b2,b3;
int counter=0,count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Butonlarý id ile tanýmlama
        b1=(Button)this.findViewById(R.id.button1);
        b2=(Button)this.findViewById(R.id.button2);
        b3=(Button)this.findViewById(R.id.button3);
        
        
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				count++;
				b1.setText(""+count);
				
			}
		});
        
 b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(counter%2==0)
					b2.setBackground(getResources().getDrawable(R.drawable.dlike));
				else
					b2.setBackground(getResources().getDrawable(R.drawable.custom_buton_background));	
				
				counter++;
			}
		});
      b3.setOnLongClickListener(new View.OnLongClickListener() {
		
		@Override
		public boolean onLongClick(View v) {
			Toast.makeText(MainActivity.this, "Uzun süre bastýðýn için çalýþtý", Toast.LENGTH_LONG).show();
			return false;
		}
	});
        
    }

  
}
