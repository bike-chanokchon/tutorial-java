package exeption_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Exception เป็นเหตุการณ์ที่เกิดขึ้นระหว่างการ execution
		 * ของโปรแกรมแล้วขัดขวางการทำงานของคำสั่งปกติ
		 * โดยมักจะเป็นเหตุการที่ไม่คาดคิดที่จะทำให้โปรแกรมหยุดทำงาน เช่น divide by zero
		 * เราต้องจัดการกับเหตุการเหล่านี้ที่เกิดขึ้นและดำเนินการต่อด้วยชุดคำสั่ง
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter a whole number to devide: ");
			int x = sc.nextInt();

			System.out.print("Enter a whole number to devide by: ");
			int y = sc.nextInt();

			int z = x / y;
			System.out.println(z);
		} catch (ArithmeticException e) {
			// ArithmeticException เหตุการเกี่ยวกับการคำนวน
			System.out.println("You can't devide by zero! IDIOT!");
		} catch (InputMismatchException e) {
			System.out.println("PLEASE ENTER A NUMBER! IDIOT!");
		} catch (Exception e) {
			// best practice จะใช้สิ่งนี้เป็นอันสุดท้าย
			System.out.println("Something went wrong!");
		} finally {
			// จะทำงาน ไม่ว่าจะมีข้อผิดพลาดหรือไม่ก็ตาม
			System.out.println("This will alway print");
			sc.close();
		}
	}
}
