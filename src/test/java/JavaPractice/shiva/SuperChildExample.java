package JavaPractice.shiva;

public class SuperChildExample extends SuperParentExample {

	// In Java, the super keyword is used primarily to refer to the immediate
	// parent class of a subclass. It can be used in several contexts to access
	// or invoke members (like variables, methods, and constructors) of the
	// parent class

	String name;
	int age;

	@Override
	public void enterUserDetals() {
		System.out.println("My Name Is: " + name);
		System.out.println("My Age Is: " + age);
	}

	SuperChildExample() {
		System.out.println("Super Child Example Default Constructor");
	}

	SuperChildExample(String name, int age) {
		super("Test", 33); // Calling Parent class Parameterized constrctor
		super.enterUserDetals();
		this.name = name; // Current class Instance Variables
		this.age = age;

		System.out.println("Value1: " + this.name);

		System.out.println("Value2: " + super.name);

		System.out.println("Value3: " + name);
		
		System.out.println("Super Child Example Parameterized Constructor");
	}

	public static void main(String[] args) {

		SuperChildExample obj = new SuperChildExample("Shiva", 25);

		System.out.println("Value4: " + obj.name);
		
		obj.enterUserDetals();

	}

	// Super Parent Example Parameterized Constructor
	// Name: Test
	// Age: 33
	// Super Child Example Parameterized Constructor
	// My Name Is: Shiva
	// My Age Is: 25

}
