package AppTestAccountBank;

public class AccountBank {
	private String accountID;
	private String agency;
	private String type;
	private String accountNumber;
	private double balance;
}

public AccountBank(String accountID, String agency, String type, String accountNumber, double balance) {
	this.accountID = accountID;
	this.agency = agency;
	this.type = type;
	this.accountNumber;
	this.balance = balance;
}

public String getAccountID() {
	return accountID;
}

public String getagency() {
	return agency;
}

public Strin gettype() {
	return type;
}

public String getAccountNumber() {
	return accountNumber;
}

public double getBalance() {
	return balance;
}

public boolean registerDeposit(double balance) {
	if (balance > 0) {
		this.balance += balance;
		return true;
	}
}