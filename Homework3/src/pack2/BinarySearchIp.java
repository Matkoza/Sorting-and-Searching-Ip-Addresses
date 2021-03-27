package pack2;

public class BinarySearchIp {

	public static int search(IPAddressesSorted[] addresses, long iPnumber) {
	    int low = 0;                                   
	    int high = addresses.length - 1;                
	        
	    while (low <= high) {                           
	        int mid = low + (high - low) / 2;           
	        if (iPnumber < addresses[mid].getIpFrom()) {  // If the IP is less than the lower bound of the current IP address, we move the high              
	            high = mid - 1;                         
	        } else if (iPnumber > addresses[mid].getIpTo()) {  // If the IP is greater than the upper bound of the current IP address, we move the low      
	            low = mid + 1;                          
	        } else  {                                    
	            return mid;                            
	        }
	    }
	    return -1; 
	}
}

