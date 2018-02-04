
public class UsedCar extends Car {
	
	private double milage;
	
	public UsedCar(String make, String model, int year, double price, double milage) {

		super(make, model, year, price);

		this.milage = milage;

	}



	public double milage() {

		return milage;

	}



	public void setMilage(double milage) {

		this.milage = milage;

	}



	public String toString() {
		return String.format(super.getMake() + "   \t" + super.getModel() 
							+ "     \t" + super.getYear() + " \t$" + super.getPrice() 
							+ "  (Used)  " + milage + " miles");
	}

}
