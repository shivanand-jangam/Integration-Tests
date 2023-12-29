package JavaPractice.shiva.inharitance;

public class Child1 extends ParentClassA{
	
	
	public Child1() {
		System.out.println("CHILD OBJECT");
	}
	
	public static void main(String[] args) {
		Child1 child1= new Child1();
		child1.calculateSalary();
	}

}
