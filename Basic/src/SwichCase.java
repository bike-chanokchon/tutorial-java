
public class SwichCase {
	public static void main(String[] args) {
		// หากเราต้องใช้ตำสั่ง if ติดต่อกันเยอะ ๆ, เราควรที่จะใช้ตำสั่ง switch มากกว่า

		String day = "Monday";

		switch (day) {
		case "Sunday":
			System.out.println("It is Sunday");
			break;
		case "Monday":
			System.out.println("It is Monday");
			break;
		case "Tuesday":
			System.out.println("It is Tuesday");
			break;
		case "Wednesday":
			System.out.println("It is Wednesday");
			break;
		case "Thurday":
			System.out.println("It is Thurday");
			break;
		case "Friday":
			System.out.println("It is Friday");
			break;
		case "Satureday":
			System.out.println("It is Satureday");
			break;
		default:
			System.out.println("That is not a day!");
		}
	}
}
