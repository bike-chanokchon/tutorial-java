import java.util.ArrayList;

public class ArrayListLecture {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * เป็น array ที่สามารถเปลี่ยนขนาดได้
		 * โดยสามารถเพิ่มหรือลบหลังจาก compile ไปแล้วได้
		 * โดยจะจะเก็บเป็น reference data type
		 * 
		 *  ซึ่งโดยปกติจะไม่สามารถทำกับ array มาตรฐานได้
		 */
		
		// ต้องใช้ wrapper classes เท่านัี้น
		ArrayList<String> foods = new ArrayList<String>();
		
		foods.add("pizza");
		foods.add("hamburger");
		foods.add("hotdog");
		
		foods.set(0, "sushi"); // set value ในตำแหน่งที่ระบุ
		foods.remove(1); // remove value ในตำแหน่งที่ระยบุ
		foods.clear(); // clear array ทั้งหมด
		
		for (int i = 0; i < foods.size(); i++) {
			System.out.println(foods.get(i)); // เก็ทข้อมูลในตำแหน่งที่ระบุ
		}
	}
}
