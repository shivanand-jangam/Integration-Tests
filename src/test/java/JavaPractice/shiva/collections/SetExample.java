package JavaPractice.shiva.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("Shiva");
		set.add("Aksay");
		set.add("Shiva");
		set.add("Vitthal@");
		set.add("Shiva ");
		set.add("Shiva");
		set.add("Shiva");
		set.add("Shiva");
		set.add("Shiva");
		set.add("Shiva");
		set.add("Vitthal@");
		set.add("Vitthal");
		set.add("Vitthal");
		set.add("Aksay ");
		set.add("Aksay  ");
		set.add("Aksay");
		set.add("Aksay");
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		
		
		for (String value : set) {
			System.out.println(value);
		}

	}

}
