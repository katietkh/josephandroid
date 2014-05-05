package com.katietkh.crystalball;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.TextView;
import com.katietkh.crystalball.R;

public class MainActivity extends Activity {

	private CrystalBall mCrystalBall = new CrystalBall();
	private TextView mAnswerLabel; 
	private Button mGetAnswerButton;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Assigning views from layout file
		mAnswerLabel = (TextView) findViewById(R.id.textView1);
		mGetAnswerButton = (Button) findViewById(R.id.button1);
		
		mGetAnswerButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				String answer = mCrystalBall.getAnAnswer();
				
				mAnswerLabel.setText(answer);
				
				animateAnswer();
			}
		});
	}
	
	private void animateAnswer() {
		AlphaAnimation fadeInAnimation = new AlphaAnimation(0, 1);
		fadeInAnimation.setDuration(1500);
		fadeInAnimation.setFillAfter(true);
		
		mAnswerLabel.setAnimation(fadeInAnimation);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}
