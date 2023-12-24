package JavaPractice.shiva.interfacePractice;

public class CalculateManagerSalary implements CalculateEmployeeSalary {

	@Override
	public void calculateBonus() {
		System.out.println("20% of salary");

	}

	@Override
	public void calculateSalary() {
		System.out.println("60L max = monthly 5L Salary + Company Shares");
	}

	@Override
	public void companyShares() {
		
	}

}
