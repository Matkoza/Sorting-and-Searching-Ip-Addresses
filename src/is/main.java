package is;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		String fileNameDefined = "C:/Users/User/Desktop/IP-COUNTRY-REGION-CITY-SHUFFLED.csv";
		IPAddress [] addresses= new IPAddress[100]; // Anything over 100k is very slow
	    File file = new File(fileNameDefined);
	    int i=0;
	    try {
	        Scanner scnr = new Scanner(file);
	        while(scnr.hasNextLine() && i!=100){
	           String data = scnr.nextLine();
	           String newStr = data.replace("\"", "");
	 	       String[] parts=newStr.split(",");
	           addresses[i]=new IPAddress(Long.parseLong(parts[0]),Long.parseLong(parts[1]), parts[2], parts[3], parts[4], parts[5]);
	            i++;

	         }
	           scnr.close();

	        }
	     
	    catch (FileNotFoundException e){

	           e.printStackTrace();
	        }
	    InsertionSort.sort(addresses);
	    for (IPAddress a: addresses) {
	    	System.out.println(a.returnInfo());
	    }
	}
}