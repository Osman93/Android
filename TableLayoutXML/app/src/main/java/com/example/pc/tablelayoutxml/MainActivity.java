package com.example.pc.tablelayoutxml;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    EditText txtUser, txtPass;
    Button btnLogin, btnCancel;
    TextView txtU, txtP;

    private void init() {
        txtUser = (EditText) findViewById(R.id.editUser);
        txtPass = (EditText) findViewById(R.id.editPass);
        btnLogin = (Button) findViewById(R.id.btnL);
        btnCancel = (Button) findViewById(R.id.btnC);
        txtU = (TextView) findViewById(R.id.textUser);
        txtP = (TextView) findViewById(R.id.textPass);

        btnCancel.setOnClickListener(this);
        btnLogin.setOnClickListener(this);


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
        switch (view.getId()) {
            case R.id.btnL:
                if (txtUser.getText().toString().equals("") && txtPass.getText().toString().equals(""))
                    Toast.makeText(getApplicationContext(), "Kullanýcý adý ve þifre girin", Toast.LENGTH_SHORT).show();
                else if (txtUser.getText().toString().equals("osman") && txtPass.getText().toString().equals("12345")) {
                    txtP.setVisibility(View.INVISIBLE);
                    txtU.setVisibility(View.INVISIBLE);
                    txtPass.setVisibility(View.INVISIBLE);
                    txtUser.setVisibility(View.INVISIBLE);
                    btnLogin.setVisibility(View.INVISIBLE);
                    btnCancel.setVisibility(View.INVISIBLE);
                    FrameLayout pnl=new FrameLayout(this);
                    TextView txt=new TextView(this);
                    txt.setText("Osman Aþar");
                    txt.setTextSize(60);
                    txt.setGravity(Gravity.CENTER);
                    FrameLayout.LayoutParams lp=new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,60);
                    lp.gravity= Gravity.CENTER;

                    pnl.addView(txt,lp);
                    setContentView(pnl);

                }
                break;
            case R.id.btnC:

                break;


        }
    }
}
