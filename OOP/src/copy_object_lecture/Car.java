package copy_object_lecture;

public class Car {
	private String make;
	private String model;
	private int year;
	
	Car() {
		
	}
	
	Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	// getter
	public String getMake() {
		return this.make;
	};
	
	public String getModel() {
		return this.model;
	}
	
	public int getYear() {
		return this.year;
	}
	
	// setter
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void copy(Car car) {
		this.setMake(car.getMake());
		this.setModel(car.getModel());
		this.setYear(car.getYear());
	}
}
