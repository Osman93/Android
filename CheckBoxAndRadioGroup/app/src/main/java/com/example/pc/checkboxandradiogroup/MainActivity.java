package com.example.pc.checkboxandradiogroup;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    EditText txt;
    LinearLayout pnlTaksitGir,pnlTaksitSayisi;
    RadioButton rdoTek,rdoTaksit;
    private void init(){
        txt=(EditText)findViewById(R.id.editText);
        rdoTaksit=(RadioButton)findViewById(R.id.rdoTaksit);
        rdoTek=(RadioButton)findViewById(R.id.rdoTek);
        pnlTaksitGir=(LinearLayout)findViewById(R.id.pnlTaksitGir);
        pnlTaksitSayisi=(LinearLayout)findViewById(R.id.taksitler);

    }
    public class RadioSelection implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if(rdoTaksit.isChecked()){
                pnlTaksitSayisi.setVisibility(View.VISIBLE);
                pnlTaksitGir.setVisibility(View.VISIBLE);

            }
            else{
                pnlTaksitSayisi.setVisibility(View.INVISIBLE);
                pnlTaksitGir.setVisibility(View.INVISIBLE);

            }
        }
    }
    public void btnClick(View v){
        pnlTaksitSayisi.removeAllViews();
        int tasksitSayi=Integer.valueOf(txt.getText().toString());

        for(int i=1;i<=tasksitSayi;i++){
            CheckBox chk=new CheckBox(this);
            chk.setText((i)+".Taksit");

            chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(((CheckBox)compoundButton).isChecked()){
                        String str=((CheckBox)compoundButton).getText().toString();
                        Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();

                    }
                }
            });
            pnlTaksitSayisi.addView(chk);

        }


    }
    private void registerListener(){
        rdoTaksit.setOnCheckedChangeListener(new RadioSelection());
        rdoTek.setOnCheckedChangeListener(new RadioSelection());

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        registerListener();
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
