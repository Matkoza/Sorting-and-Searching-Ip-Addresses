package is;


public class IPAddress implements Comparable<IPAddress> {
	long ipFrom;
	long ipTo;
	String countryCode;
	String countryName;
	String regionName;
	String cityName;
	  public IPAddress(long ipFrom, long ipTo, String countryCode, String countryName, String regionName, String cityName) {
	        this.ipFrom = ipFrom;
	        this.ipTo = ipTo;
	        this.countryCode = countryCode;
	        this.countryName =countryName;
	        this.regionName = regionName;
	        this.cityName = cityName;
	    }
	  public String returnInfo(){ 
		  return this.ipFrom + " " + this.ipTo + " " + this.countryCode + " "+ this.countryName +" "+ this.regionName + " " +this.cityName;
		  }
	  public long getIpFrom() { 
		  return this.ipFrom;
	  }
	  public long getIpTo() { 
		  return this.ipTo;
	  }
	  public String getCountryCode() { 
		  return this.countryCode;
	  }
	  public String getCountryName() { 
		  return this.countryName;
	  }
	  public String getRegionNme() { 
		  return this.regionName;
	  }
	  public String getCityNme() { 
		  return this.cityName;
	  }


	  @Override
	public int compareTo(IPAddress that) {                               
        if (this.ipFrom > that.ipFrom) {                                     
            return 1;                                                   
        } else if (this.ipFrom < that.ipFrom) {                              
            return -1;                                                 
        } else {                                                        
            return 0;                                                  
        }
    }

	
}
