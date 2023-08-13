
public class Main {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.make);
		System.out.println(car1.model);
		car1.drive();
		car1.brake();
		
		Car car2 = new Car();
		car2.drive();
	}
}
