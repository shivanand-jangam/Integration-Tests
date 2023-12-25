package JavaPractice.shiva.ConstructorExample;

public class ChildClass extends ParentClass {

	String name;
	int age;

	public void print() {
		System.out.println("Child Class method");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	ChildClass(String a, int b) {
		name = a;
		age = b;
	}

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass("Ravi", 30);
		childClass.print();
	}

}
