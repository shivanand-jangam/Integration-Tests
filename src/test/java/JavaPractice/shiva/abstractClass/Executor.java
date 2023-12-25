package JavaPractice.shiva.abstractClass;

public class Executor {
	static AccountActivity savingAccount;

	public Executor(String type) {
		if (type.equalsIgnoreCase("Saving")) {
			savingAccount = new SavingAccount();
		} else if (type.equalsIgnoreCase("Current")) {
			savingAccount = new CurrentAccount();
		}
	}

	public static void main(String[] args) {
		Executor executor = new Executor("Current");
		savingAccount.checkMinBalance();
	}

}
