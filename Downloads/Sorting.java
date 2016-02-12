import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Sorting {

	//Sorts an array alphabetically
	public ArrayList<String> Sorting (ArrayList<String> myArray) {
		myArray= new ArrayList<String>();
		for (int i=0; i<myArray.size();i++){
			Collections.sort(myArray);

		}
		return myArray;
	}
	//This method uses a buffer reader to read line by line via bufferreader and then sorts the lines through a List or array
	//and runs Collections.sort() to sort the list.
	public static List<String> SortLines (String fileName) throws Exception{
		
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String inputLine;
		List<String> myArray = new ArrayList<String>();
		while ((inputLine = bufferedReader.readLine()) != null) {
			myArray.add(inputLine);
		}
		fileReader.close();

		Collections.sort(myArray);

		String sortedCache = "sortedCache.txt";
		FileWriter fileWriter = new FileWriter(sortedCache);
		PrintWriter out = new PrintWriter(fileWriter);
		for (String outputLine : myArray) {
			out.println(outputLine);
		}
		out.flush();
		out.close();
		fileWriter.close();
		return myArray;
		
	} 

	//Reader which is single lined, Open the file
	//	Move data from the File to a String or an Array of Strings.
	//	If the file is more than one line,each line will be an entry in the array. Parse each string into an array of values
	//	Thus making a 2D array
	//	Return the 2D array to whoever needs the data. Close the file
	public static int[] simpleIntFileRead(String fileName){
		  int[] rtnArray=null;
		  try {
		    BufferedReader in = new BufferedReader(new FileReader(fileName));
		    String str;
		    str = in.readLine();
		    if (str!=null){
		      String[] rawData = str.split(",");
		      rtnArray = new int[rawData.length];
		      for(int index = 0;index <rawData.length;index++ ){
		        rtnArray[index] = Integer.parseInt(rawData[index]);
		      }
		}
		    in.close();
		  } catch (IOException e) {
		    System.out.println("File Read Error");
		  }
		  return rtnArray;
	}

	public static void main(String[] args) {

		//Testing Collections.sort(x)
		ArrayList<String> myArray = new ArrayList<String>();

		myArray.add("Z");
		myArray.add("E");
		myArray.add("F");
		myArray.add("V");
		myArray.add("B");
		myArray.add("O");
		myArray.add("T");
		myArray.add("R");
		myArray.add("X");
		myArray.add("Y");
		myArray.add("A");
		myArray.add("P");
		myArray.add("O");

		System.out.println("Intial List: " + myArray);
		Collections.sort(myArray);
		System.out.println("Sorted List: " + myArray);
	}

}
