package JavaPractice.shiva;

public class ConditionalStatements {

	public void ifElseStmt() {

		boolean condition = false;
		int count = 1;

		if (!condition || count == 2) {
			// 0 || 0 =0
			// 0 || 1 =1
			// 1 || 0 =1
			// 1 || 1 =1
			// =======================================
			// 0 && 0 =0
			// 0 && 1 =0
			// 1 && 0 =0
			// 1 && 1 =1
			System.out.println("Condition is TRUE");
		} else {
			System.out.println("Condition is FALSE");
		}
	}

	public void elseIfStmt() {
		boolean condition = false;
		String name = "Akshay";
		if (condition || name.equalsIgnoreCase("Shiva")) {
			System.out.println("Im Shiva");

		} else if (condition || name.equalsIgnoreCase("Akshay")) {
			if (!condition) {
				System.out.println("Inner IF");
			} else {
				System.out.println("Inner Else");
			}
		} else if (condition || name.equalsIgnoreCase("Vitthal")) {
			System.out.println("Im Vitthal");
		} else {
			System.out.println("Im God");
		}
	}

	public void switchStament() {
		
		int mon = 2;
		switch (mon) {
			case 1 :
				System.out.println("January");
				break;
			case 2 :
				System.out.println("February");
				break;
			case 3 :
				System.out.println("March");
				break;
			case 4 :
				System.out.println("April");
				break;
			case 5 :
				System.out.println("May");
				break;
			case 6 :
				System.out.println("June");
				break;
			default :
				System.out.println("Not present in first half month of year");
		}
	}

	public static void main(String[] args) {
		ConditionalStatements conditionalStatements = new ConditionalStatements();
//		conditionalStatements.elseIfStmt();
		conditionalStatements.switchStament();
	}

}
