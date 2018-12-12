package main;

public class Screen implements ScreenSpec {

	  private String resolution;
	  private int refreshrate;
	  private int responsetime;
	  
	  public Screen(String resolution, int refreshrate, int responsetime) {
	    this.resolution = resolution;
	    this.refreshrate = refreshrate;
	    this.responsetime = responsetime;
	  }
	  
	  public String getResolution() {
	    return resolution;
	  }
	  public int getRefreshRate() {
	    return refreshrate;
	  }
	  public int getResponseTime() {
	    return responsetime;
	  }
	  
	  public String toString() {
	    return "Screen : Resolution : " + resolution + "\n"
	          +"Refresh rate : " + refreshrate + "\n" 
	          +"Response time : " + responsetime;
	  }
	}
