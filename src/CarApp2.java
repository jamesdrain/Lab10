/*
 *  Author: James Drain
 *  Date:   2/4/2018
 *  Code:   Stores car info to an array list and prints
 *          using separate Class, Car. Extended by 
 *          sub-class UsedCar.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int i;
		int endlessLoop = 1;

		System.out.println("Welcome to the Grand Circus Motors admin console!");
		
		// Create Array List carLot and populate it with car data

		ArrayList<Car> carLot = new ArrayList<>();

		Car car1 = new Car("Ford", "Fiesta", 2017, 12345.32);
		carLot.add(car1);
		Car car2 = new Car("Honda", "Civic", 2017, 11012.11);
		carLot.add(car2);
		Car car3 = new Car("Circus", "Unicycle", 2017, 69.77);
		carLot.add(car3);
		UsedCar usedCar1 = (UsedCar) new UsedCar("Subaru", "Outback", 2005, 8078.66, 168245.05);
		carLot.add(usedCar1);
		UsedCar usedCar2 = (UsedCar) new UsedCar("GetAway", "Sticks", 1977, 1212.13, 32000.01);
		carLot.add(usedCar2);
		UsedCar usedCar3 = (UsedCar) new UsedCar("VeeDub", "HippieBus", 1969, 4200.99, 888888.88);
		carLot.add(usedCar3);

		System.out.println("Current Inventory: \n");

		while (endlessLoop == 1) {
			
			// Print out Array List carLot

			for (i = 0; i < carLot.size(); i++) {
				System.out.println(i + 1 + " " + carLot.get(i));
			}
			System.out.println(i + 1 + " To quit");

			System.out.println("\nWhich one are you thinking about? ");
			int userChoice = scnr.nextInt();

			// Exit program (removes user from endless loop)
			
			if (userChoice == i + 1) {
				System.out.println("Ok, thank you for your interest.");
				scnr.close();
				return;
			}
			System.out.println(carLot.get(userChoice - 1));
			scnr.nextLine();
			System.out.println("Now that's a cool ride... want to buy it? (y/n)");
			String buyCar = scnr.nextLine();
			
			// Remove user's chosen vehicle from inventory if they want to buy
			// then loop again
			
			if (buyCar.equalsIgnoreCase("y")) {
				System.out.println("\tGreat choice!\nAnything else catch your eye? \n");
				carLot.remove(userChoice - 1);
			}
			// otherwise just loop again
		}
		scnr.close();
	}

}