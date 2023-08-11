import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's your name ?");
		String name = sc.nextLine();
		
		System.out.println("How old are you ?");
		int age = sc.nextInt();
		
		System.out.println("What's your favorite food ?");
		String food = sc.nextLine();
		
		sc.close();
		
		System.out.println("Hello, " + name);
		System.out.println("You are " + age + " year old.");
		System.out.println("Favorite food is " + food);
	}
}
