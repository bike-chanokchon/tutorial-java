import java.util.Random;

public class DiceRoller {
	private Random random;
	private int number;
	
	DiceRoller() {
		this.random = new Random();
		this.number = 0;
	}

	void roll() {
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}
}
