
public class StringMethod {
	public static void main(String[] args) {
		// String เป็น reference data type ที่สามารถเก็บตัวอักษร (char) ได้หลายตัว
		
		String name = "Bro";
		
		System.out.println(name.equals("Bro")); // ตรวจสอบว่า string เท่ากันหรือไม่
		System.out.println(name.equalsIgnoreCase("bro")); // ตรวจสอบโดยไม่สน lower and upper case
		System.out.println(name.length()); // ดูขนาดของ string
		System.out.println(name.charAt(0)); // ดูตัวอักษรในตำแหน่งที่ระบุบน string
		System.out.println(name.indexOf("B")); // ค้นหาอักชนะนั้นและส่งคืนตำแหน่งใน string
		System.out.println("".isEmpty()); // ตรวจสอบว่า string เป็นค่าว่างหรือไม่
		System.out.println(name.toUpperCase()); // เปลี่นให้เป็นตัวใหญ่ทั้งหมด
		System.out.println(name.toLowerCase()); // เปลี่นให้เป็นตัวเล็กทั้งหมด
		System.out.println("  Bro  ".trim()); // ตัดช้องว่าง ซ้าย ขวา
		System.out.println(name.replace('o', 'a')); // เปลี่นตัวอักษรที่ระบุเป็นอีกตัว
	}
}
