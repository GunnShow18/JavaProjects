package bankaccountapp;

public class Savings extends Account {
	// List properties specific to the savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	// Constructor to initialize settings for the Savings properties
	public Savings(String name, String SSN, double initDeposit) {
		super(name, SSN, initDeposit);
		super.accountNumber = "1" + super.accountNumber;
		
	}
	// List any methods specific to savings account
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Savings");
	}

}
