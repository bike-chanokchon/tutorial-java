import java.util.*;

public class TwoDArrayListLecture {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> groceries = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> bakeries = new ArrayList<String>();
		bakeries.add("pasta");
		bakeries.add("garlic bread");
		bakeries.add("donut");
		groceries.add(bakeries);
		
		ArrayList<String> products = new ArrayList<String>();
		products.add("tomato");
		products.add("zucchini");
		products.add("peppers");
		groceries.add(products);
		
		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("soda");
		drinks.add("coffee");
		groceries.add(drinks);
		
		System.out.println(groceries);
	}
}
