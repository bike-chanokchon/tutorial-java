
public class NestedLoop {
	public static void main(String[] args) {
		// การวนซ้ำซ้อน (loop ซ้อน loop) 
		// การสั่งให้ทำคำสั่งหลายรอบและในการทำงานแต่ละรอบจะสั่งให้ทำคำสั่งที่อยู่ในนั้นอีกหลายรอบ
		
		int limit = 6;
		for (int i = 0; i <= limit; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
