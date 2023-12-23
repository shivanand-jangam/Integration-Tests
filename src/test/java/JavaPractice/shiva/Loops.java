package JavaPractice.shiva;

public class Loops {

	public void forLoopExample() {

		String[] myArray = {"Shiva", "Akshay", "Vitthal", "Test"};

		// List<String> myList= new ArrayList<String>();
		// for (int i = 0; i < myList.size(); i++) {
		//
		// }

		for (int i = 0; i < 2; i++) {

			if (myArray[i].equalsIgnoreCase("Akshay")) {
				System.out.println("Akshay is there in the list");
			}
		}
	}

	public void forEachLoopExample() {

		String[] myArray = {"Shiva", "Akshay", "Vitthal", "Test"};

		// List<String> myList= new ArrayList<String>();
		// for(String myValue:myList) {
		//
		// }

		for (String myValue : myArray) {
			if (myValue.equalsIgnoreCase("Akshay")) {
				System.out.println("Akshay is there in the list");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Loops loops = new Loops();
		loops.forLoopExample();
//		loops.forEachLoopExample();

	}

}
