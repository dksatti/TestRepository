package com.cloudgensys.training.exercise3;

import java.io.BufferedReader;
import java.util.regex.Pattern;

public class readXMLFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String thisline = null; 
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream( new File("C://Users/CGDELL23/Desktop/contact.xml"))));
	    while(br.readLine() != null){
	    	System.out.println
	    }
	}

}""
try {
	
	   br = new BufferedReader(new InputStreamReader(new FileInputStream(new File ("Your file path"))));
	   
	   	//create a temporary  string variable to store the line read from file
	   Sttring line = "";
	   
	   //read line froom file using buffered reader
	   Line = br.readline();
	   
	   //if this is not the last line  of the  file
	   while (line != null){
		   	//append the contentt of string  builder
		   	fileContent.append(line);
	   }catch (IOException e){
		   	//catch IOExcception
		   	System.out.println ("Cannot read teh  file");)
	   }catch (FileNotFoundException ex{
			   // catch FileNotFoundException
			   Syste.out.println ("File Not Found");
			   )finally {
				   	//finally close the file buffer to avoid memory leaks
				if (br != null){
						try{
								br.close();
						}catch(Exception e){
								System.out.println  ("Cannot clsoe the buffer");)
						}
						}
				}
			   }
	   }
}
/* now you have the file content saved in filcontent StringBuilder
write a print statementt to check if you were scuccessfful till this step */

System.out.println ("File contents are : "+ fileContent.toString());

//pattern for data between <username></username>";

Pattern userPattern = Patttern.complile ("<username>(.*?)</usrename>"));
Matcher userMatcher = userPattern.matcher(fileContent.toString());

//pattern for data between <userID></userID>
Pattern idPattern = Patterncompile (""<userID"'>(a-z0-9]*?)</userID>"
		Matcher idMatcher = idPattern.matcher(fileContent.toString());
		