package com.example.pc.ifreleme;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    EditText txtSifre;
    TextView txt;
    TextView txtOlusan;
    Button btnC,btnG;
    String girilen="",yedek;
    int degis[];
    private void init(){
        txtSifre=(EditText)findViewById(R.id.edit);
        txtOlusan=(TextView)findViewById(R.id.textView2);
        btnC=(Button)findViewById(R.id.btnS);
        btnG=(Button)findViewById(R.id.btnC);
        btnC.setOnClickListener(this);
        btnG.setOnClickListener(this);


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

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btnS:

                if(txtSifre.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Sifre girin lütfen",Toast.LENGTH_SHORT).show();

                }else {
                    char c;
                    yedek=txtSifre.getText().toString().trim();
                    degis=new int[yedek.length()];
                    for(int i=0;i<yedek.length();i++){
                        c=yedek.charAt(i);
                        degis[i]=(int)c;
                        if(i%2==0){
                            degis[i]/=2;
                            girilen+=Character.toString((char)degis[i]);
                        }else{
                             degis[i]*=2;
                            girilen+=Character.toString((char)degis[i]);

                        }


                    }


                txtOlusan.setText(girilen);
                girilen="";


                }

                break;
            case R.id.btnC:
                LinearLayout pnl=new LinearLayout(this);
                pnl.setOrientation(LinearLayout.VERTICAL);
                ScrollView sv=new ScrollView(this);
                String ret = "";

                try {
                    InputStream inputStream = getResources().openRawResource(R.raw.deneme);

                    if ( inputStream != null ) {
                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        String receiveString = "";
                        StringBuilder stringBuilder = new StringBuilder();

                        while ( (receiveString = bufferedReader.readLine()) != null ) {
                            stringBuilder.append(receiveString);

                        }

                        inputStream.close();
                        ret = stringBuilder.toString();
                        txt=new TextView(this);
                        txt.setText(ret);
                        txt.setTextSize(40);
                        pnl.addView(txt);
                    }
                }
                catch (FileNotFoundException e) {
                    Log.e("login activity", "File not found: " + e.toString());
                } catch (IOException e) {
                    Log.e("login activity", "Can not read file: " + e.toString());
                }



                sv.addView(pnl);
                setContentView(sv);
                break;

        }
    }
}
