package com.cloudgensys.training.exercise3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoadXmlFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;

		try {
			FileInputStream ipFile = new FileInputStream("C://Users/CGDELL23/Desktop/contact.xml");
			while ((ch = ipFile.) != -1){
				System.out.println(ch);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException i){
			i.printStackTrace();
		}
	}

}
