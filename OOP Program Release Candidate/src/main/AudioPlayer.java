package main;

public class AudioPlayer extends Product implements MultimediaControl {
	  
	  String audioSpecification;
	  ItemType mediaType;
	  
	  public AudioPlayer(String name, String audioSpecification) {
	    super(name);
	    this.audioSpecification = audioSpecification;
	    mediaType = ItemType.AUDIO;
	  }
	  
	  public String toString() {
	    return super.toString() + "\n"
	    + "Audio Spec : " + audioSpecification + "\n"
	    + "Type : " + mediaType;
	  }
	  
	  public void play() {
	    System.out.println("Playing");
	  }
	  public void stop() {
	    System.out.println("Stopping");
	  }
	  public void previous() {
	    System.out.println("Previous");
	  }
	  public void next() {
	    System.out.println("Next");
	  }
	}