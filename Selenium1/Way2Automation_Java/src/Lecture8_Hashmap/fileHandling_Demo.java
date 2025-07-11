package Lecture8_Hashmap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;

public class fileHandling_Demo {

	public static void main(String[] args) throws IOException 
	{
	  String filepath=".\\src\\Lecture8_Hashmap\\Test";
	  
	  
	  FileReader reader=new FileReader(filepath);
	  System.out.println(reader.read());
	  
	  //Need to charcter rather than numeric value
	  
	  System.out.println((char)reader.read());
	  
	  // need to show all the words on by one from the file
	  int i;
	  while ((i=reader.read()) !=-1) 
	  {
		  System.out.print((char)i);
		
	}
	  reader.close();
	  
	  // When we write the something into file then create an object
	  
	  FileWriter writer=new FileWriter(filepath);
	  System.out.println(writer.write("Pankaj"));

	}

}
