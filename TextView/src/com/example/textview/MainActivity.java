package com.example.textview;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {
TextView text,text2;
Button b1,b2;
Typeface face1;
int count=0,count2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        text=(TextView)findViewById(R.id.textView1);
        text2=(TextView)findViewById(R.id.textView2);
        
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        		
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        
        
        
        //bu k�s�m yaz� �eklini istedi�imiz gibi de�i�tirme yarar.
        face1=Typeface.createFromAsset(getAssets(), "fonts/horrendo.ttf");
        text.setTypeface(face1);
       //G�rd���n�z gibi setOnClickListener metodu TextView de�i�kenindede i� g�r�yor. 
        text2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text2.setText("Ziyaret edin:http://osmanasar.besaba.com/");
				if(text2.getLinksClickable() == true) {
					text2.setLinkTextColor(Color.RED);
				}
			}
		});
        
        
    }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.button1:
			if(count%2==0){
				text.setVisibility(View.INVISIBLE);//visibile i�in 0,invisible i�in 4 girmek laz�m
				b1.setText("G�r�n�r");
			}
			else{
				
				text.setVisibility(View.VISIBLE);
				b1.setText("G�r�nmez");
			}
			count++;
			
			break;
			
		case R.id.button2:
			if(count2%4==0){
				text.setRotation(90);
				b2.setText("D�nd�r �uan 90 derece");
				
			}
			else if(count2%4==1){
				text.setRotation(180);
				b2.setText("D�nd�r �uan 180 derece");
				
			}
			else if(count2%4==2){
				text.setRotation(270);
				b2.setText("D�nd�r �uan 270 derece");
				
			}
			else{
				text.setRotation(360);
				b2.setText("D�nd�r �uan ilk hali");
				
			}
			count2++;	
			
			
			break;
		
		
		}
	}

  
}
