package JavaPractice.shiva.inharitance;

public class ParentClassA {

	private int months = 12;
	private int annualsalary = 1200000;

	public void calculateSalary() {
		int monthSalary = annualsalary / months;
		System.out.println("Salary: " + monthSalary);
	}

}
