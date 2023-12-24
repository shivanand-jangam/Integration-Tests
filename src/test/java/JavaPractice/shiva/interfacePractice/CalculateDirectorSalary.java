package JavaPractice.shiva.interfacePractice;

public class CalculateDirectorSalary implements CalculateEmployeeSalary {

	@Override
	public void calculateBonus() {
		System.out.println("10% of Company Profit");

	}

	@Override
	public void calculateSalary() {
		System.out.println(
				"1.5Cr max = monthly 15L Salary and monthly Company Shares");
	}

	@Override
	public void companyShares() {
		
	}

}
