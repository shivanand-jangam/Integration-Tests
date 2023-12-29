package JavaPractice.shiva.abstractClass;

public abstract class AccountActivity {

	int a;
	
	public AccountActivity() {
		System.out.println("Account Activity Object");
	}
	
	
	public abstract void calculateInterest();

	public abstract void checkMinBalance();
	
	public void checkTheBalance() {
		System.out.println("Logic to check the balance");
	}

	public String getLast5Transactions() {
		System.out.println("Logic to get last 5 trsacations");
		return "txn";
	}
}
