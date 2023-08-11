import java.util.Scanner;

public class Hypotenuse {
	public static void main(String[] args) {
		double x, y, z;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size x: ");
		x = sc.nextDouble();
		
		System.out.print("Enter size y: ");
		y = sc.nextDouble();
		
		sc.close();
		
		z = Math.sqrt((x * x) + (y * y));
		
		System.out.println("The hupotenuse is " + z);
	}
}
