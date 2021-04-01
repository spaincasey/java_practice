
public class Varargs {

	public static void main(String[] args) {
		String item1 = "Apples";
		String item2 = "Oranges";
		String item3 = "Pears";
		printShoppingList(item1, item2, item3);
		printShoppingList("Bread", "Milk", "Eggs", "Bananas");

	}
	
	private static void printShoppingList(String... items) {
		System.out.println("SHOPPING LIST");
		for(int i = 1; i <= items.length; i++) {
			System.out.println(i + ". " + items[i - 1]);
		}
		System.out.println();
	}
	
//	private static void printShoppingList(String string1, String string2) {
//		System.out.println("SHOPPING LIST");
//		System.out.println("1. " + string1);
//		System.out.println("2. " + string2);
//		System.out.println();
//	}
//	
//	private static void printShoppingList(String string1, String string2, String string3) {
//		System.out.println("SHOPPING LIST");
//		System.out.println("1. " + string1);
//		System.out.println("2. " + string2);
//		System.out.println("3. " + string3);
//		System.out.println();
//	}
	
//	private static void printShoppingList(String[] items) {
//		System.out.println("SHOPPING LIST");
//		for(int i = 1; i <= items.length; i++) {
//			System.out.println(i + ". " + items[i - 1]);
//		}
//		int i = 0;
//		for (String item: items) {
//			i++;
//			System.out.println(i + ". " + item);
//		}
//		System.out.println();
//	}
	


}
