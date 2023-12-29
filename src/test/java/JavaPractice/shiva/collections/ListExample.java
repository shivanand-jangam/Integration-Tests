package JavaPractice.shiva.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		// Arrays Vs ArrayList
		
		list.add("zzzzzz");
		list.add("Shiva");
		list.add("Aksay");
		list.add("Shiva");
		list.add("Vitthal");
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);

		for (String value : list) {
			System.out.println(value);
		}
		
		System.out.println("***************");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
