package com.cloudgensys.training;

public class OrderOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Start = System.nanoTime();
		for (int j = 0; j < 5000; j++){
			System.out.println ("Ïteration Count" +j);
		}
		float total= System.nanoTime() - Start;
		System.out.println("Total Execution time" +total);
	}
}

//Total Execution time1.34217728E8