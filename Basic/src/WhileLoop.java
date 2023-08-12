import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		// ทำงานภายใน block ของ code ตราบใดที่เงื่อนไขยังเป็นจริง
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		
		while (name.isBlank()) {
			System.out.print("Enter your name: ");
			name = sc.nextLine();
		}
		
		sc.close();
		System.out.println("Hello " + name);
	}
}
