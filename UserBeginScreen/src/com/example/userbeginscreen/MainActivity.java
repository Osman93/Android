package com.example.userbeginscreen;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
String[] comp;
EditText user,pass;
String userS,userP;
Intent in;
Button buton,bTurk,bEn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        comp=getResources().getStringArray(R.array.user);
        userS=comp[0];
        userP=comp[1];
        
        user=(EditText)findViewById(R.id.user);
        pass=(EditText)findViewById(R.id.pass);
        
        in=new Intent(getApplicationContext(),User.class);
        
        buton=(Button)findViewById(R.id.access);
        buton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String mesaj;
				mesaj=getResources().getString(R.string.Succed);
				 if(userS.equals(user.getText().toString())&&userP.equals(pass.getText().toString())){
				     Toast.makeText(getApplicationContext(), mesaj+" "+userS, Toast.LENGTH_SHORT).show();  
					 startActivity(in);	
				        	
				        }
				 else{
					 
					 Toast.makeText(getApplicationContext(), R.string.Fail, Toast.LENGTH_SHORT).show();
					 
				 }
			}
		});
        
       bTurk=(Button)findViewById(R.id.buttonTurk);
       bEn=(Button)findViewById(R.id.buttonEnglish);
       bTurk.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			 Locale locale = new Locale("");
		        Locale.setDefault(locale);
		        Configuration config = new Configuration();
		        config.locale = locale;
		        getResources().updateConfiguration(config,getResources().getDisplayMetrics());
		        setContentView(R.layout.activity_main);
		        
		        RestartActivity(); //Run the method as the last thing
		        Toast.makeText(getApplicationContext(), "Dil T�rk�e", Toast.LENGTH_SHORT).show();
		}
	});
       bEn.setOnClickListener(new View.OnClickListener() {
   		
   		@Override
   		public void onClick(View v) {
   			// TODO Auto-generated method stub
   		 Locale locale = new Locale("en");
         Locale.setDefault(locale);
         Configuration config = new Configuration();
         config.locale = locale;
         getResources().updateConfiguration(config,getResources().getDisplayMetrics());
         
         setContentView(R.layout.activity_main);
         RestartActivity(); //Run the method as the last thing
         Toast.makeText(getApplicationContext(), "Language English", Toast.LENGTH_SHORT).show();
   		}
   	});
        
    }

    private void RestartActivity(){
        Intent intent = getIntent();
        finish();
        startActivity(intent);
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
