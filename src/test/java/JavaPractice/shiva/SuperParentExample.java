package JavaPractice.shiva;

public class SuperParentExample {

	String name;
	int age;

	public void enterUserDetals() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	SuperParentExample() {
		System.out.println("Super Parent Example Default Constructor");
	}

	SuperParentExample(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Super Parent Example Parameterized Constructor");
	}


}
