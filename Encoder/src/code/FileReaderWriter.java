package code;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriter {
	public static String readFile(String fileName) {
		String output = "";
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
	
		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    
		    output = sb.toString();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return output;
	}
	
	public static void writeFile(String fileName, String string) {
		 try(FileWriter writer = new FileWriter(fileName, false))
	     {
		     writer.write(string);      
		     writer.flush();
	     } catch(Exception e){
	    	 e.printStackTrace();
	     } 
	}
}
