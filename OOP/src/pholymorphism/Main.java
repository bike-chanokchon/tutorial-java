package pholymorphism;

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		/*
		 *
		 * Car, Bicycle, Boat ต่างก็เป็น Vehicle เหมือนกัน แต่พอเราจะเพิ่มลงไปใน array เราจะไม่สามารถเพิ่มพร้อมกันได้เพราะเป็น object คนละชนิดกัน
		 * เราจึงต้องใช้ Polymophism มาแก้ปัญหานี้
		 * 
		 * 
		 * เมื่อเราเปลี่ยนชนิดของ Array เป็น Vehicle ทำให้เราสามารถเก้บ car, bicycle, boat ไว้ใน array ก้อนเดี่ยวได้ โดยทั้ง 3 อย่างจะต้องสืบทอดมาจาก Vehicle
		 * สิ่งนี้เรียกว่า Polymophism
		 * โดยใน car, bicycle, boat ต่างก็มีการกำหนดการทำงานใหม่ให้เหมาะสมกับหน้าที่ของตัวเอง
		 * 
		 */
		Vehicle[] racers = { car, bicycle, boat };
		Object[] racers2 = { car, bicycle, boat };
		
//		car.go();
//		bicycle.go();
//		boat.go();
		for (Vehicle x : racers) {
			x.go();
		}
	}
}
