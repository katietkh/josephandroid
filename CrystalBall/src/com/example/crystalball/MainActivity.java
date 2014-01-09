package com.example.crystalball;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.hardware.Sensor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	public static final String TAG = MainActivity.class.getSimpleName();
	
	private CrystalBall mCrystalBall = new CrystalBall();
	private TextView mAnswerLabel;
	private Button mGetAnswerButton;
	private ImageView mCrystalBallImage;
	
	
	protected void onCreate1(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Assigning the views from the layout file
		mAnswerLabel = (TextView) findViewById(R.id.textView1);
		mGetAnswerButton = (Button) findViewById(R .id.button1);
		mCrystalBallImage = (ImageView) findViewById(R.id.imageView1);
		
		mGetAnswerButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				String answer = mCrystalBall.getAnAnswer();
				
				//Update the label with our answer
				mAnswerLabel.setText(answer);
				
				//Animate the ball and response
				animateCrystalBall();
				animateAnswer();
				playSound();
			}
		});
		
		//Toast.makeText(this, "Yay! Our Activity was created", Toast.LENGTH_LONG).show();
		
		Toast welcomeToast=Toast.makeText(this, "Look at me up here!", Toast.LENGTH_LONG);
		welcomeToast.setGravity(Gravity.TOP, 0, 0);
		welcomeToast.show();
		
		Log.d(TAG, "We're debugging woot");
		
	}

	private void animateCrystalBall() {
		mCrystalBallImage.setImageResource(R.drawable.ball_animation);
		AnimationDrawable ballAnimation = (AnimationDrawable) mCrystalBallImage.getDrawable();
		if (ballAnimation.isRunning()) {
			ballAnimation.stop();
		}
		ballAnimation.start();
	}
	//Animation object 
	private void animateAnswer() {
		AlphaAnimation fadeInAnimation = new AlphaAnimation(0, 1);
		fadeInAnimation.setDuration(1500);
		fadeInAnimation.setFillAfter(true);
		
		mAnswerLabel.setAnimation(fadeInAnimation);
	}
	
	private void playSound() {
		MediaPlayer player = MediaPlayer.create(this, R.raw.crystal_ball_sound);
		player.start();
		player.setOnCompletionListener(new OnCompletionListener() {
			
			@Override
			public void onCompletion(MediaPlayer mp) {
				mp.release();
				
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
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	
	// Assigning the views from the layout file
	mAnswerLabel = (TextView) findViewById(R.id.textView1);
	mCrystalBallImage = (ImageView) findViewById(R.id.imageView1);
	
	
	}
}
	
	
