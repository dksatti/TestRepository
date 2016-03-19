package com.cloudgensys.training.exercise1;

public class SathyaStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HI";
		float Start = System.nanoTime();
		for (int i=0; i < 100000; i++){
			s=s+ " "+ i;
		}
		System.out.println (s);
		
	float Total= System.nanoTime() - Start;
	System.out.println("Total Execution time" +Total);
	}

}//Total Execution time4.02653184E8