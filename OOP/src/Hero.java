
public class Hero extends Person {
	String power;
	
	Hero(String name, int age, String power) {
		// เรียกใช้งาน constructor ของ parent
		super(name, age);
		this.power = power;
	}
	
	public String toString() {
		// เรียกใช้งาน method ของ parent
		return super.toString() + this.power;
	}
}
