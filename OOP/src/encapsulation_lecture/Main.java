package encapsulation_lecture;

public class Main {
	public static void main(String[] args) {
		Car car = new Car("Tesla", "Model 3", 2022);
		car.setModel("Model 2");
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
	}
}
