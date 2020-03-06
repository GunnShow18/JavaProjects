package bankaccountapp;

public class BankAccountApp {
	
	public static void main(String[] args) {
	
		Checking account1 = new Checking("Tim Wilson", "333456745", 1500);
		
		Savings saveacc1 = new Savings("Bruce Wayne", "123113344",3000);
		
		account1.showInfo();
		saveacc1.showInfo();
	
		
		// Read a CSV file then create new accounts based on that data
	}
}
