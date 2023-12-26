package JavaPractice.shiva;

public class ThisExample {

	// the this keyword in Java is used to refer to the current object within
	// its methods and constructors.
	// It provides a way to access
	// 1.instance variables,
	// 2.invoke other constructors,
	// 3.distinguish between instance and local variables,
	// 4.and enable method chaining.

	String name; // Instance Variable
	int age;

	public ThisExample() {
		this("Shiva", 25, 1);
	}

	public ThisExample(String name, int age) { // Local Variable
		this.name = name;
		this.age = age;
	}

	public ThisExample(String name, int age, int id) { // Local Variable
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {

		ThisExample example = new ThisExample();

		System.out.println(example.name);
		System.out.println(example.age);

		example.add(10, 20).sub(30, 50).add3(10, 20, 30);
		// Returning the current object to allow method chaining.

	}

	public ThisExample add(int a, int b) {
		int c = a + b;
		System.out.println("Added: " + c);
		return this;
	}

	public ThisExample sub(int a, int b) {
		int c = a - b;
		System.out.println("Substraction: " + c);
		return this;
	}

	public ThisExample add3(int a, int b, int d) {
		int c = a + b + d;
		System.out.println("Added 3 Number: " + c);
		return this;
	}
}
