package JavaPractice.shiva.abstractClass;

public class CurrentAccount extends AccountActivity {

	@Override
	public void calculateInterest() {
		System.out.println("10% interest");
	}

	@Override
	public void checkMinBalance() {
		System.out.println("12% Charges");
	}

}
