package JavaPractice.shiva.interfacePractice;

public class ExecutionClass {

	static CalculateEmployeeSalary salary;

	public ExecutionClass(String person) {
		if (person.equalsIgnoreCase("Lead")) {
			salary = new CalculateLeadSalary();
		} else if (person.equalsIgnoreCase("Managers")) {
			salary = new CalculateManagerSalary();
		} else if (person.equalsIgnoreCase("Director")) {
			salary = new CalculateDirectorSalary();
		} else if (person.equalsIgnoreCase("SrManager")) {
			salary = new CalculateSrmanagerSalary();
		}
	}

	public static void main(String[] args) {
		ExecutionClass executionClass = new ExecutionClass("SrManager");
		salary.calculateSalary();
	}

}
