package shells;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
	static long startTime = System.nanoTime();
	public static void main(String[] args) {
		String fileNameDefined = "C:/Users/User/Desktop/IP-COUNTRY-REGION-CITY-SHUFFLED.csv";
		IPAddress [] addresses= new IPAddress[1048576]; // ShellSort is able to sort all 1M addresses rather quickly (10s)
	    File file = new File(fileNameDefined);
	    int i=0;
	    try {
	        Scanner scnr = new Scanner(file);
	        while(scnr.hasNextLine() && i!=1048576){
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
	    ShellSort.sort(addresses);
	    for (IPAddress a: addresses) {
	    	System.out.println(a.returnInfo());
	    }
	    long stopTime = System.nanoTime();
	 	long elapsedTime = stopTime - startTime;
	 	System.out.println("Time elapsed in miliseconds: " + elapsedTime/1000000);
	 	System.out.println("Time elapsed in seconds: " + elapsedTime/1000000000);
	}
}
