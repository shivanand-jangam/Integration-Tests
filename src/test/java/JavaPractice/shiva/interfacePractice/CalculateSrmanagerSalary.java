package JavaPractice.shiva.interfacePractice;

public class CalculateSrmanagerSalary implements CalculateEmployeeSalary{

	@Override
	public void calculateBonus() {
		System.out.println("30% of salary");
	}

	@Override
	public void calculateSalary() {
		System.out.println("1Cr max = monthly 10L Salary + Company Shares + Allowances");
	}

	@Override
	public void companyShares() {
		
	}
	

}
