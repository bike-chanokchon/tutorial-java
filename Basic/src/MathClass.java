
public class MathClass {
	public static void main(String[] args) {
		double x = 3.14;
		double y = -10;
		
		System.out.println(Math.max(x, y)); // หาค่าที่มากที่สุดระหว่างตัวแปร 2 ตัว
		System.out.println(Math.abs(y)); // เปลี่ยน - เป็น +
		System.out.println(Math.sqrt(10)); // หาสแควรูท
		System.out.println(Math.round(x)); // ปัดเศษเป็ยจำนวนเต็มที่ใกล้เคียงที่สุด
		System.out.println(Math.ceil(x)); // ปัดขึ้นเสมอ
		System.out.println(Math.floor(3.99)); // ปัดลงเสมอ
	}
}
