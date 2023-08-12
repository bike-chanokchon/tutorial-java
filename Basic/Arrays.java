
public class Arrays {
	public static void main(String[] args) {
		// ใช้จัดเก็บข้อมูลหลาย ๆ ตัวไว้ในตัวแปรเดียว

		String[] cars = { "Camaro", "Corvette", "Tesla" };
		cars[0] = "Mustang";
		for (String car : cars) {
			System.out.println(car);
		}
		
		System.out.println("------");
		
		String[] cars2 = new String[3];
		cars2[0] = "Camero";
		cars2[1] = "Convette";
		cars2[2] = "Testla";
		for (int i = 0; i < cars2.length; i++) {
			System.out.println(cars2[i]);
		}
	}
}
