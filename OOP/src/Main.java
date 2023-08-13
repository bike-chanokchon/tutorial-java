
public class Main {
	public static void main(String[] args) {
		Car2 car = new Car2();
		car.go();
		car.readSpeed();
		
		Bicycle bike = new Bicycle();
		bike.stop();
		bike.readSpeed();
		System.out.println(bike.speed);
		System.out.println(bike.pedals);
	}
}
