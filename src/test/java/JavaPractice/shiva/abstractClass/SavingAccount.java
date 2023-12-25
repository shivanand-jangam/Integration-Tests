package JavaPractice.shiva.abstractClass;

public class SavingAccount extends AccountActivity{

	@Override
	public void calculateInterest() {
		System.out.println("7% interest");
	}

	@Override
	public void checkMinBalance() {
		System.out.println("2% Charges");
	}

}
