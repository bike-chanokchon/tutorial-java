
public class Car {
	String name;
	String make = "Tesla";
	String model = "Model 3";
	int year = 2020;
	String color = "blue";
	double price = 120000.00;
	
	Car(String name) {
		this.name = name;
	}
	
	void drive() {
		System.out.println("You drive the car");
	}
	
	void brake() {
		System.out.println("You step on the brakes");
	}
	
	public String toString() {
		return make + " " + model + " " + Integer.toString(year) + " " + color + " " + Double.toString(price);
	}
}

//Car car1 = new Car();
//System.out.println(car1.make);
//System.out.println(car1.model);
//car1.drive();
//car1.brake();
//
//Car car2 = new Car();
//car2.drive();
