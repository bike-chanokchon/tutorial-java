package copy_object_lecture;

public class Main {
	public static void main(String[] args) {
		Car car1 = new Car("Tesla", "Model 3", 2022);
		Car car2 = new Car("Ford", "Mustang", 2022);
		
		// การทำแบบนี้เป็นการให้ car3 ชี้ address memory ไปที่เดียวกันกับ car1 ไม่ใช่การ copy object
		Car car3 = car1;
		
		// สร้าง method copy ขึ้นมาแล้วทำการส่ง object ที่เราต้องการ copy เข้าไป ซึ่งการที่เราได้ address ใหม่นั้นเกิดจากการที่เรา สร้าง instance ขึ้นมาใหม่
		Car car4 = new Car();
		car4.copy(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);
	}
}
