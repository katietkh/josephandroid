package com.katietkh.crystalball;

import java.util.Random;

public class CrystalBall {
	// Member variables (properties about the object)
	public String[] mAnswers ={
			"It is certain",
			"My reply is no",
			"It is doubtful",
			"Concentrate and ask again",
			"Unable to answer now" };
	
	// Methods (abilities: things the object can do)
	public String getAnAnswer() {
		
		String answer = "";
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		
		answer = mAnswers[randomNumber]; 
		
		return answer;
	}

}
