package JavaPractice.shiva;

public class Calculator {

	static int c = 10;
	int cc = 355;

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		Calculator calculator2 = new Calculator();
		
		System.out.println(calculator.c);
		calculator.c=15;
		System.out.println(calculator.c);
		System.out.println(calculator.c);
		System.out.println(calculator.c);
		System.out.println(calculator.c);
		calculator.c=20;
		System.out.println(calculator.c);
		System.out.println(calculator.c);
		System.out.println("=========================");
		
		calculator2.cc=2555;
		System.out.println(calculator.cc);
		System.out.println(calculator2.cc);
		
	}

	protected void add(int a, int b) {
		c = a + b;
		System.out.println("Addition of Two number: " + c);
	}

	private int add(int a, int b, int d) {
		c = a + b;
		System.out.println("Addition of Two number: " + c);
		return c;
	}

	public int add() {
		System.out.println("Addition of Two number: " + c);
		return c;
	}

	private class InnerClass {
		int y = 5;

		public int innerAdd() {
			System.out.println("Addition of Two number: " + c);
			return c;
		}
	}

}
