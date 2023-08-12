
public class WrapperClasses {
	public static void main(String[] args) {
		/*
		 * Wrapper Classes
		 * คือ class java api ที่เราสามารถใช้ในการดำเนินการกับชนิดข้อมูลแบบ primitive data type
		 * โดยจะมีฟังก์ชันมาให้เราใช้งานเพื่อจัดการกับชนิดข้อมูลนั้น ๆ เช่น แปลงชนิดข้อมูล แปลงรูปแบบของข้อมูล
		 * แต่ Wrapper classes จะเป็นรูปแบบ reference data type
		 * โดยเราสามารถใช้ใน collections เช่น ArrayList ได้ด้วย
		 * 
		 * auto boxing
		 * 
		 * unboxing - Java compiler จะทำการแปลงข้อมูลระหว่าง primitive data type และ reference data type
		 */
		
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Bro";
		
		// สามารถแปรง wrapper เป็น primitive data type
		
		if (a == true) {
			System.out.println("This is true");
		}
	}
}
