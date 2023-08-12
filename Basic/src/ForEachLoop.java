import java.util.ArrayList;

public class ForEachLoop {
	public static void main(String[] args) {
		/*
		 * เป็นการวนซ้ำองค์ประกอบทั้งหมดใน array หรือ collection
		 * มีขั้นตอนที่น้อยกว่า อ่านได้ง่ายกว่า
		 * แต่ยืดหยุ่นน้อยกว่า
		 */
		
		String[] animals = { "car", "dog", "rat", "bird" };
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		ArrayList<String> animals2 = new ArrayList<String>();
		animals2.add("cat");
		animals2.add("dog");
		animals2.add("brid");
		for (String animal : animals2) {
			System.out.println(animal);
		}
	}
}
