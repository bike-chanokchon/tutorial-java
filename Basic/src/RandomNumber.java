import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random random = new Random();
		
		// ไม่ใช่การ random จริง เป็นเพียงการ sudo random
		int x = random.nextInt(6) + 1; // สุ่มระหว่าง 0 - 5
		double y = random.nextDouble();
		boolean z = random.nextBoolean();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
