package pack1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class main {

	public static void main(String[] args) {
		 String fileNameDefined = "C:/Users/User/Desktop/IP-COUNTRY-REGION-CITY-SHUFFLED.csv";
		 IPAddress [] addresses= new IPAddress[1000];
	     File file = new File(fileNameDefined);
    	 int i=0;
	     try {
	         Scanner scnr = new Scanner(file);
	         while(scnr.hasNextLine() && i!=1000){
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
	     
	     BubbleSort.sort(addresses);
    
	     for (IPAddress a: addresses) {
 	    System.out.println(a.returnInfo());
	     }
		try {
			FileWriter writer = new FileWriter("C:/Users/User/Desktop/Sorted.csv");
			 for (IPAddress a: addresses) {
			  	    writer.write("\""+a.ipFrom + "\""+ ","+"\"" + a.ipTo + "\""+ ","+"\"" + a.countryCode +"\""+ ","+"\"" + a.countryName + "\""+ ","+"\""+ a.regionName + "\""+ ","+"\""+ a.cityName+ "\""+"\n");
	 	     }
			 writer.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	    

	     
	    
	     
	}

}
