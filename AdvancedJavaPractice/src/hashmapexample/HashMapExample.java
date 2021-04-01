package hashmapexample;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> phonebook = new HashMap<>();
		
		// NO ORDER TO ENTRIES
		phonebook.put("a", 10);
		phonebook.put("Kevin", 12345);
		phonebook.put("h", 3);
		phonebook.put("Jill", 98765);
		phonebook.put("Brenda", 123123);
		phonebook.put("c", 8);
		phonebook.put("Brenda", 22222);
		phonebook.put(null, 000);
		phonebook.put("j", 1);
		System.out.println(phonebook);
		if(phonebook.containsKey("Brenda")) {
			phonebook.remove("Brenda");
		}
		phonebook.clear();
		System.out.println(phonebook); 

	}

}
