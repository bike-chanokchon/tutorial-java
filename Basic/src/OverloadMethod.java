
public class OverloadMethod {
	public static void main(String[] args) {
		// method ที่ใช้ชื่อเหมือนกัน แต่มี parameters ต่างกัน โดย method name + parameters = method signature
		
		int x = add(4, 3, 2);
		System.out.println(x);
	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}
}
