package pholymophism_dynamic;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ให้ผู้ใช้ระบุว่าต้องการ dog หรือ cat แล้วจึงสร้าง instance ตามที่ผู้ใช้ระบุ

		Scanner sc = new Scanner(System.in);
		System.out.println("What animal do you want ?");
		System.out.println("1: dog | 2: cat");
		int choice = sc.nextInt();
		sc.close();

		Animal animal;
		if (choice == 1) {
			animal = new Dog();
		} else {
			animal = new Cat();
		}
		
		animal.speak();
	}
}
