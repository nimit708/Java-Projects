package utilities;

import java.util.List;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CSV {
	// This method will read data from a CSV file and will return the elements in a list 
	public static List<String[]> read(String file)
	{
	  List<String[]> bankData = new LinkedList<String[]>();	
	  String readLines;
	  try
	  {
		  BufferedReader br = new BufferedReader(new FileReader(file));
		  while((readLines = br.readLine())!= null)
		  {
		    String[] dataRows = readLines.split(",");
		    bankData.add(dataRows);
		  }
	  }
	  catch(FileNotFoundException exception)
	  {
		 System.out.println("Could not find file");
		 exception.printStackTrace();
	  } catch (IOException e) {
		 System.out.println("Could not read file");
		 e.printStackTrace();
	  }

	  return bankData;
	}
}
