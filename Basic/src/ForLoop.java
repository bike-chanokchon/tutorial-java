
public class ForLoop {
	public static void main(String[] args) {
		// ทำงาน block ของ code โดนจำกัดจำนวนรอบ
		
		for (int i = 0; i < 1; i++) {
			System.out.println(i);
		}
		
		System.out.println("-----");
		
		for (int i = 0; i < 1; ++i) {
			System.out.println(i);
		}

		System.out.println("-----");
		
		int a = 1;
		int b = ++a;
		System.out.println(a);
		System.out.println(b);
	}
}
