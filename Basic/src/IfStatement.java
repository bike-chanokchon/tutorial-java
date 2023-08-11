
public class IfStatement {
	public static void main(String[] args) {
		int age = 80;

		if (age >= 18 && age < 75) {
			// if condition is true
			System.out.println("ok");
		} else if (age >= 75) {
			// more condition
			System.out.println("ok boomer");
		} else {
			// if condition is false
			System.out.println("not ok");
		}
	}
}
