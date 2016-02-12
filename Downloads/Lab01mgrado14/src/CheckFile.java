import java.io.File;

public class CheckFile {

	// I created this method to check if the cache file exists and return filename for the correct file based on name (int)
	public int CheckFile(int i) {
		String fileName =null;
		fileName = i+ ".txt";
		return i;
		
		
 
	}
	// I created this method to detect a file. Or to see if a file exists.
	public static boolean fileExists(String fileName){
		return (new File(fileName)).isFile();
			
		}
	
	//I created this method to check if the cache file exists and return filename for the correct file based on name (String) 
	public String CheckFileString(String name){
		String fileName =null;
		fileName = name+ ".txt";
		return name;
	}

}
