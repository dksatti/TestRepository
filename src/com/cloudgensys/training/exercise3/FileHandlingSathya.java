package com.cloudgensys.training.exercise3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingSathya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			FileInputStream input;
			try {
				input = new FileInputStream("C://Users/CGDELL23/Desktop/Salary.txt");
			
			int c;
			
				while ((c = input.read())!= -1)
				{
						System.out.print(Character.toString((char) c));;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}

}
