package JavaPractice.shiva.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		// Add key-value pairs to the map
		map.put(1, "Shiva");
		map.put(2, "Akshay");
		map.put(3, "Vitthal");
		map.put(4, null);
		map.put(4, null);
		map.put(4, null);
		map.put(null, "n1");
		map.put(null, "n2");
		map.put(null, "n3");
		map.put(5, "Shiva");

		// Iterate over the map entries
		// In Java's Map interface, the entrySet() method returns a Set view of
		// the mappings contained in the map. Each element in this set is a
		// Map.Entry object that represents a key-value pair. Using this Set,
		// you can iterate over the map's key-value pairs.
		//
		// The Map.Entry interface provides methods to get the key and value
		// associated with an entry, and it's commonly used when iterating over
		// a map's entries.
		//
		// Here's a brief overview and an example to demonstrate how to use
		// entrySet():

		for (Entry<Integer, String> value : map.entrySet()) {
			System.out.println(value.getKey() + ": " + value.getValue());
		}

		System.out.println("Size: " + map.size());

		// Retrieve values using keys
		String value5 = map.get(5);
		System.out.println("Name5: " + value5);
		
		
		System.out.println("*********************************");
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("Shiva", 1);
		map2.put("Akshay", 2);
		for (Entry<String, Integer> value2 : map2.entrySet()) {
			System.out.println(value2.getKey() + ": " + value2.getValue());
		}
		
		System.out.println("Value: "+map2.get("Shiva"));
	}
}
