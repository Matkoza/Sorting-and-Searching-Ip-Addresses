package is;


public class InsertionSort extends AbstractSort {
	public static void sort(Comparable[] addresses) {
	    for (int i = 0; i < addresses.length; i++) {             // 1
	        for (int j = i; j > 0; j--) {                       // 2
	            if (addresses[j].compareTo(addresses[j-1])==1) {       // 3
	                swap(addresses, j, j - 1);                   // 3
	            } else {
	                break;                                      // 4
	            }
	        }
	    }
	}
}
//if (less(elements[j], elements[j - 1]))