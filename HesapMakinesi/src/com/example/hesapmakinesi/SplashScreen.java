package com.example.hesapmakinesi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SplashScreen extends Activity {

	private Animation animation;
    Button bArti,bEksi;
	Button bCarp,bBöl;
	LinearLayout linear;
	TextView app;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
        bArti=(Button)findViewById(R.id.buttonAnimPlus);
        bEksi=(Button)findViewById(R.id.buttonAnimMinus);
        bCarp=(Button)findViewById(R.id.buttonAnimMix);
        bBöl=(Button)findViewById(R.id.buttonAnimDiv);
        app=(TextView)findViewById(R.id.appText);
        
		
		
		if (savedInstanceState == null) {
			In();
		}

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				end();
				app.setVisibility(View.VISIBLE);
				
			}
		}, 3000);
	}

	private void In() {
		

		animation = AnimationUtils.loadAnimation(this, R.anim.first_animation);
		bArti.startAnimation(animation);

		animation = AnimationUtils.loadAnimation(this, R.anim.second_animation);
		bEksi.startAnimation(animation);
		
		animation = AnimationUtils.loadAnimation(this, R.anim.first_animation);
		bCarp.startAnimation(animation);
		
		animation = AnimationUtils.loadAnimation(this, R.anim.second_animation);
		bBöl.startAnimation(animation);
	}

	private void end() {
		

		animation = AnimationUtils.loadAnimation(this, R.anim.first_animation_back);
		bArti.startAnimation(animation);

		animation = AnimationUtils.loadAnimation(this, R.anim.second_animation_back);
		bEksi.startAnimation(animation);
		
		animation = AnimationUtils.loadAnimation(this, R.anim.first_animation_back);
		bCarp.startAnimation(animation);
		
		animation = AnimationUtils.loadAnimation(this, R.anim.second_animation_back);
		bBöl.startAnimation(animation);

		animation.setAnimationListener(new AnimationListener() {
			@Override
			public void onAnimationEnd(Animation arg0) {
				Intent intent = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(intent);
				finish();
			}

			@Override
			public void onAnimationRepeat(Animation arg0) {
			}

			@Override
			public void onAnimationStart(Animation arg0) {
			}
		});

	}

	@Override
	public void onBackPressed() {
		// Do nothing
	}

}