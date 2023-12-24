package JavaPractice.shiva.interfacePractice;

public class CalculateLeadSalary implements CalculateEmployeeSalary {

	@Override
	public void calculateBonus() {
		System.out.println("10% of salary");

	}

	@Override
	public void calculateSalary() {
		System.out.println("24L max and monthly 2L Salary");
	}

	@Override
	public void companyShares() {
		
	}

}
