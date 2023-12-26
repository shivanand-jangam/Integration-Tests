package JavaPractice.shiva.collections;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {

		String[] strArr = new String[4];
		String[] strArr2 = {"zxy","Shiva", "Akshay", "Vitthal"};

		strArr[0] = "Vitthal";
		strArr[1] = "Akshay";
		strArr[2] = "Shiva";
		strArr[3] = null;

		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		System.out.println("********************");

		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}

		System.out.println("********************");

		Arrays.sort(strArr2);

		for (String shiva : strArr2) {
			System.out.println(shiva);
		}

	}

}
