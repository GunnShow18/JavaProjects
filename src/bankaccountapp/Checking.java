package bankaccountapp;

public class Checking extends Account {
	// List properties specific to a Checking account
	int debitCardNumber;
	int debitCardPin;
	
	// Constructor to initialize checking account properties
	public Checking(String name, String SSN, double initDeposit) {
		super(name, SSN, initDeposit);
		super.accountNumber = "2" + super.accountNumber;
	}
	
	// List any methods specific to a checking account
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Checkings");
	}
	
}
