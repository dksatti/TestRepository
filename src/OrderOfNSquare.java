package com.cloudgensys.training;

public class OrderOfNSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Start = System.nanoTime();
		for (int i = 0; i < 5000; i++){
			for (int j=0; j < 5000; j++){
				System.out.println ("iteration count" +j);
			}
		}//End of for() - 1
		float total = System.nanoTime();
		System.out.println ("total execution time" +total);	
	}

}
//total execution time1.95175286E15