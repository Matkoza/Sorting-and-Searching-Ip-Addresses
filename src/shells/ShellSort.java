package shells;

public class ShellSort extends AbstractSort {
	public static void sort(Comparable[] addresses) {
	    int h = 1;                                                      // 1
	    while (h < addresses.length / 3) {                               // 1
	        h = 3 * h + 1;                                              // 1
	    }
	        
	    while (h >= 1) {                                                // 2
	        for (int i = h; i < addresses.length; i++) {                 // 3
	            for (int j = i; j >= h; j -= h) {                       // 4
	                if (addresses[j].compareTo(addresses[j-h])==-1) {           // 5
	                    swap(addresses, j, j - h);                       // 5
	                } else {
	                    break;                                          // 6
	                }
	            }
	        }
	        h = h / 3;                                                  // 7
	    }
	}
}
