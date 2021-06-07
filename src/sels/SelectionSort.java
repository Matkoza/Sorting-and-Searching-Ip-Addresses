package sels;

public class SelectionSort extends AbstractSort {
	public static void sort(Comparable[] addresses) {
	    for (int i = 0; i < addresses.length; i++) {             
	        int min = i;                                        
	        for (int j = i + 1; j < addresses.length; j++) {     
	            if (addresses[j].compareTo(addresses[min])==-1) {         
	                min = j;                                    
	            }
	        }
	        swap(addresses, i, min);                             
	    }
	}
}


