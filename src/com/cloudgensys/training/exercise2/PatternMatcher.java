package com.cloudgensys.training.exercise2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t = "It was the best of times";
		
		Pattern pattern = Pattern.compile("the");
		
		Matcher matcher = pattern.matcher(t);
		
		if (matcher.find()){
			System.out.println ("Found Match");
		}else{
			System.out.println("No match found");
		}
		
			
	}

}
