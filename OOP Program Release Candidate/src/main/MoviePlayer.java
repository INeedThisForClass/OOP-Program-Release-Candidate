package main;

public class MoviePlayer extends Product implements MultimediaControl {
	  
	  Screen screen;
	  MonitorType monitorType;
	  
	  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
	    super(name);
	    this.screen = screen;
	    this.monitorType = monitorType;
	  }
	  
	  public String toString() {
	    return super.toString() + "\n"
	          +screen.toString() + "\n"
	          +"Monitor Type : " + monitorType;
	  }
	  
	  public void play() {
	    System.out.println("Playing movie");
	  }
	  public void stop() {
	    System.out.println("Stopping movie");
	  }
	  public void previous() {
	    System.out.println("Previous movie");
	  }
	  public void next() {
	    System.out.println("Next movie");
	  }
	}