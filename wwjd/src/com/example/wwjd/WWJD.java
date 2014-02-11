package com.example.wwjd;

import java.util.Random;

public class WWJD {
	// Member variables (properties about the object)
	public String[] mAnswers = {
	"answer 1",
	"answer 2",
	"answer 3",
	"answer 4",
	"answer 5" };
	
	//Methods
	public String getAnAnswer() {
		
			String answer = "";
			
			Random randomGenerator = new Random();
			int randomNumber = randomGenerator.nextInt(mAnswers.length);
			
			answer = mAnswers[randomNumber];
			
			return answer;
	}
}
