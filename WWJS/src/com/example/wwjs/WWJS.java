package com.example.wwjs;

import java.util.Random;

public class WWJS {
	// properties about the object
		public String[] mAnswers ={
				"Indeed",
				"No. Just no.",
				"Ummmm",
				"Well now that's just stupid",
				"Unable to answer now" };
		
		// Methods 
		public String getAnAnswer() {
			
			String answer = "";
			Random randomGenerator = new Random();
			int randomNumber = randomGenerator.nextInt(mAnswers.length);
			
			answer = mAnswers[randomNumber]; 
			
			return answer;
		}

}

