package JavaPractice.shiva.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HashTableExample {

	public static void main1(String[] args) {
		Map<Integer, String> hashTable = new Hashtable<>();

		// Add key-value pairs to the map
		hashTable.put(1, "Shiva");
		hashTable.put(2, "Akshay");
		hashTable.put(3, "Vitthal");
		hashTable.put(4, "Shiva");
		hashTable.put(5, "TEST1");
		hashTable.put(5, "TEST2");
		hashTable.put(5, "TEST3");

		for (Entry<Integer, String> value : hashTable.entrySet()) {
			System.out.println(value.getKey() + ": " + value.getValue());
		}
	}

	@DataProvider(name = "mydata")
	public Object[][] dataProviderMethod() {
		return new Object[][]{{1, "Shiva"}, {2, "Akshay"}, {3, "Vitthal"}};
	}

	@Test(dataProvider = "mydata")
	public void testMethod(Hashtable<Integer, String> data) {

		for (Entry<Integer, String> value : data.entrySet()) {
			System.out.println("My Key: " + value.getKey() + ", Value: "
					+ value.getValue());
		}
			
	}
}
