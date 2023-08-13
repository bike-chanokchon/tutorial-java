
public class Method {
	public static void main(String[] args) {
		// method คือ กลุ่มของ code ที่จะดำเนินการเมื่อถูกเรียกใช้
		// การตั้งชื่อ method ต้องขึ้นต้นด้วยตัวพิมเล็ก
		
		// ค่าที่เราส่งไปให้ method เราเรียกว่า arguments
		String message = "This is method lecture.";
		pushMessage(message);
		pushMessage(Integer.toString(add(5, 5)));
	}
	
	// ตัวแปรที่ใช้รับค่าที่ถูกส่งเข้ามา เราเรียกว่า parameters
	static void pushMessage(String message) {
		System.out.println(message);
	}
	
	static void hello() {
		System.out.println("Hello");
	}
	
	static int add(int x, int y) {
		return x + y;
	}
}
