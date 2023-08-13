
public class PrintfLecture {
	public static void main(String[] args) {
		/*
		 * 
		 * เป็น method ทางเลือกที่ใช้ควบคุมข้อมูลรูปแบบการแสดงข้อความไปยัง console
		 * โดยจะรับ 2 arguments คือ format string, (object/variable/value)
		 * โดยจะมี format string ต่าง ๆ ดังนี้
		 * 		- %s	แทนข้อมูลข้อความ
		 * 		- %d	แทนข้อมูลตัวเลข
		 * 		- %.2f	แทนข้อมูลตัวเลขแบบทศนิยม โดยเลข 2 คือจำนวนทษนิยมที่ต้องการ
		 * 		- %b	เทนข้อมูลจริง เท็จ
		 * 		- %c	แทนข้อมูลตัวอักษรหรือ char
		 * 
		 */
		
		boolean mb = true;
		char mc = '@';
		String ms = "Bro";
		int mi = 50;
		double md = 1000000;
		
		System.out.printf("\n%b", mb);
		System.out.printf("\n%c", mc);
		System.out.printf("\n%s", ms);
		System.out.printf("\n%d", mi);
		System.out.printf("\n%.2f", md);
		
		// [width]
		// กำหนดจำนวนตัวอักษรขั้นต่ำ ที่จะเขียน output
		System.out.printf("\nHello %10s d", ms);
		System.out.printf("\nHello %-10s d", ms);
		
		// [Precision]
		// ตั้งค่าตัวเลขความแม่นยำ เมื่อต้องแสดงผล floating-point values (float, double)
		System.out.printf("\nYou have this much money %2f", md);
		
		// [Flags]
		// เพิ่ม effect ให้กับ output
		System.out.printf("\nYou have this much money %,.2f", md);
	}
}
