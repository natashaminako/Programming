package AppTestAccountBank;

public class TestAccountBank {
	private int AccountID;
	private String agency;
	private String accountNumber;
	private char type;
	private double balance;
	private double creditlimit;

	public AccountBank(int AccountID, String agency, String accountNumber, char type, double balance, double creditLimit) {
		this.AccountID = AccountID;
		this.agency = agency;
		this.accountNumber = accountNumber;
		this.type = 'N';
		this.balance = 0.0;
		this.creditlimit = 0.0;
	}

	public AccountBank(int AccountID, String agency, String accountNumber, chat type, double balance, double creditLimit) {
		this.AccountID = AccountID;
		this.agency = agency;
		this.accountNumber = accountNumber;
		this.type = 'S';
		this.balance = 0.0;
		this.creditLimit = creditLimit;
	}

	public boolean changeLimit(double balance) {
		if (type == 'S') {
			if (balance == 0) {
				type = 'N';
				creditLimit = 0.0;
			} else {
				creditLimit = balance;
			}
			return true;
		}
		return false;
	}

	public void registerDeposit(double balance) {
		if (balance > 0) {
			if (type == 'N') {
				if (0.0 >= -creditlimit) {
					balance -= balance;
					return true;
				}
			}
		}
	}
	return false;
}
