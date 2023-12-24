package JavaPractice.shiva.Polymorphism;

public class ClassA {

	public void add(int a, int b, String value) {

	}

	private int add(int a, int b, int c) {

		return 1;
	}

	protected boolean add(String value, int a, int b) {

		return true;
	}

	public static void main(int aa) {
		ClassA a = new ClassA();
		a.add(2, 3, 3);
		a.add(2, 3, "ascvsvx");
	}

	public static void main(String[] args) {
		ClassA a = new ClassA();

		a.add(2, 3, 3);
		a.add(2, 3, "ascvsvx");
	}
}
