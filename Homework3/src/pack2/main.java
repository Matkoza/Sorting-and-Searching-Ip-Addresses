package pack2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		 String fileNameDefined = "C:/Users/User/Desktop/Sorted.csv";
		 IPAddressesSorted [] addresses= new IPAddressesSorted[1000];
	     File file = new File(fileNameDefined);
	     int i=0;
	     try {
	         Scanner scnr = new Scanner(file);
	         while(scnr.hasNextLine() && i!=1000){
	            String data = scnr.nextLine();
	            String newStr = data.replace("\"", "");
	 	        String[] parts=newStr.split(",");
	            addresses[i]=new IPAddressesSorted(Long.parseLong(parts[0]),Long.parseLong(parts[1]), parts[2], parts[3], parts[4], parts[5]);
	             i++;

	          }
	            scnr.close();

	         }
	      catch (FileNotFoundException e){

	             e.printStackTrace();
	          }
	      Scanner scnnr = new Scanner(System.in);
	      System.out.println("Enter ip");
	      String ip=scnnr.nextLine();
	      String[] partss=ip.split("\\.");
    	  int w=Integer.parseInt(partss[0]);
    	  int x= Integer.parseInt(partss[1]);
    	  int y=Integer.parseInt(partss[2]);
    	  int z=Integer.parseInt(partss[3]);
    	  long IPnumber = 16777216*w + 65536*x + 256*y +z;
    	  int result= BinarySearchIp.search(addresses,IPnumber);
    	  if(result==-1) {
    		  System.out.println("The ip address does not exist");
    	  }
    	  else {
    	  System.out.println("The index of the ip address is "+ BinarySearchIp.search(addresses,IPnumber)+", Details: " +"\n"  +addresses[BinarySearchIp.search(addresses,IPnumber)].returnInfo());
    	  }
    	  scnnr.close();
	}
}