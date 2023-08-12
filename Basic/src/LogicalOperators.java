import java.util.Scanner;

public class LogicalOperators {
	public static void main(String[] args) {
		/*
		 * Logical operators ใช้สำหรับเชื่อมนิพจน์สองตัวขึ้นไป
		 *
		 * && (AND) เงื่อนไขทั้ง 2 ฝั่งต้องเป็นจริง
		 * || (OR) เงื่อนไจอันใดอันหนึ่งเป็นจริง
		 * ! (NOT) กลับค่าบูลีนที่ได้จากเงื่อนไข
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = sc.next();
		sc.close();

		if (response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game!");
		} else {
			System.out.println("You are still playing the game.");
		}

		int temp = 10;

		if (temp > 30) {
			System.out.println("It is hot outside");
		} else if (temp >= 20 && temp <= 30) {
			System.out.println("It is warm outside");
		} else {
			System.out.println("It is cold outside");
		}
	}
}
