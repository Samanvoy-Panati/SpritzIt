package com.example.rsvp;



/**
 * Created by andrewgiang on 3/19/14.
 */
public class DefaultDelayStrategy implements DelayStrategy {
    @Override
    public int delayMultiplier(String word) {
    	int temp;
        if (word.length() >= 6 || word.contains(",") || word.contains(":") || word.contains(";") || word.contains(".") || word.contains("?") || word.contains("!") || word.contains("\"")) {
            temp = 3;
        if (word.contains("Ameya")){
        	temp = 56;
        } 
        return temp;
        }
        return 1;
    }
}
