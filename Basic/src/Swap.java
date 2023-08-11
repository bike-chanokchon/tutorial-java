
public class Swap {
	public static void main(String[] args) {
		String x = "a";
		String y = "b";
		
		String temp = x;
		x = y;
		y = temp;
		
		System.out.println(x);
		System.out.println(y);
	}
}
