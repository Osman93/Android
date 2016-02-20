package com.example.pc.osmanandroidbaslangic;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {
    ImageView image;
    TextView texxt;
    Typeface face;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        image=(ImageView)findViewById(R.id.imageView);
        Bitmap icon= BitmapFactory.decodeResource(getResources(), R.drawable.mm);
        image.setImageBitmap(icon);
        texxt=(TextView)findViewById(R.id.textSp);
        face=Typeface.createFromAsset(getAssets(),"fonts/horrendo.ttf");
        texxt.setTypeface(face);
        //Bu kýsým görüntüyü ölçekliyor
        float a=image.getScaleX();
        image.setScaleX(3 * a);
        float b=image.getScaleY();
        image.setScaleY(b * 3);
        //Bu kýsým ortalamaya yarýyor
        image.setPivotX(image.getPivotX() / 2 - 10);
        image.setPivotY(image.getPivotY()/2+40);
        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(MainActivity.this,SplashSceen.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}

