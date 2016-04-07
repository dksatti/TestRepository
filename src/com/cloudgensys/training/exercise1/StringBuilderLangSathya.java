package com.cloudgensys.training.exercise1;
import java.lang.StringBuilder;

public class StringBuilderLangSathya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Start = System.nanoTime();
		StringBuilder sb = new StringBuilder("HI");
		for (int i=0; i<100000; i++){
			sb.append(i);
		}
		System.out.println(sb);
		
		float Total= System.nanoTime() - Start;
		System.out.println("Total Execution time" +Total);
		System.out.println("Sathya");
		System.out.println("Srinu");
		System.out.println("Padma");;;;
		System.out.println("Äkka");
		System.out.println("Amma");
		System.out.println("Nanna");
		
	}
}
