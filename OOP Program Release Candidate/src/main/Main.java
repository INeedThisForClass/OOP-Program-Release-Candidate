package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int selection = 0;
		System.out.println("Welcome to Oracle Productions!");
		System.out.println("Build a virtual product based on your preferences.");
		ArrayList<Product> products = new ArrayList<Product>();
		do {
			// displays menu prompt
			System.out.println("1. Build an AudioPlayer");
			System.out.println("2. Build a MoviePlayer");
			System.out.println("3. Display my Productions");
			System.out.println("4. Quit Oracle Productions");
			System.out.print("Choose a product to build: ");
			selection = in.nextInt(); // user selection
			in.nextLine(); // consumes empty space
			Product product = null; // user product
			if (selection == 1) {
				System.out.println("You've chosen to built an AudioPlayer.");
				System.out.print("Type a name for your AudioPlayer: ");
				String name = in.nextLine();
				System.out.print("Specify an audio specification for you AudioPlayer(ie. MP3, WAV): ");
				String audioSpec = in.nextLine();
				product = new AudioPlayer(name, audioSpec);
				products.add(product);
				System.out.println("Your AudioPlayer has been added to your production line.");
				System.out.println(); // create space
			} else if (selection == 2) {
				System.out.println("You've chosen to built a MoviePlayer.");
				System.out.print("Type a name for your MoviePlayer: ");
				String name = in.nextLine();
				System.out.print("Specify a screen resolution for your MoviePlayer(ie.1080x768): ");
				String resolution = in.nextLine();
				System.out.print("Specify a refresh rate for the screen of your MoviePlayer(ie.40): ");
				int refreshrate = in.nextInt();
				System.out.print("Specify a response time for the screen of your MoviePlayer(ie.22): ");
				int responsetime = in.nextInt();
				System.out.print("Specify a monitor type for your MoviePlayer(ie.LCD, LED): ");
				in.nextLine(); // consume empty space
				String monitortype = in.nextLine();
				product = new MoviePlayer(name, new Screen(resolution, refreshrate, responsetime),
						MonitorType.valueOf(monitortype));
				products.add(product);
				System.out.println("Your MoviePlayer has been added to your production line.");
				System.out.println(); // create space
			} else if (selection == 3) {
				if (products.isEmpty()) 
					System.out.println("No products to display.");
					System.out.println(); // create space
				for (int i = 0; i < products.size(); i++) {
					System.out.println(products.get(i).toString());
					System.out.println(); // create space
				}
			}
		} while (selection != 4);
		in.close();
	}

	public void test() {

		// Write one line of code to create an ArrayList of products
		ArrayList<Product> products = new ArrayList<Product>();
		// Write one line of code to call testCollection and assign the result to the
		// ArrayList
		products = testCollection();
		// Write one line of code to sort the ArrayList
		// Collections.sort(products);
		// Call the print method on the ArrayList
		printArrayList(products);
	}

	// Step 15
	// Complete the header for the testCollection method here

	public static ArrayList<Product> testCollection() {

		AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
		AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
		MoviePlayer m1 = new MoviePlayer("DBPOWER MK101", new Screen("720x480", 40, 22), MonitorType.LCD);
		MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK", new Screen("1366x768", 40, 22), MonitorType.LED);

		// Write one line of code here to create the collection
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(a1);
		products.add(a2);
		products.add(m1);
		products.add(m2);
		return products;
	}

	// Step 16
	// Create print method here
	static void printArrayList(ArrayList<Product> products) {
		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i));
		}
	}

}
