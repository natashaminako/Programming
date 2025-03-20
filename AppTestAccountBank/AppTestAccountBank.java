package AppTestAccountBank;

import java.util.Scanner;

public class AppTestAccountBank {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		AppTestAccountBank account = new AppTestAccountBank[4];

		AppTestAccountBank c1 = new AppTestAccountBank("N");
		AppTestAccountBank c2 = new AppTestAccountBank("S");
		AppTestAccountBank c3 = new AppTestAccountBank("S);

				account[0] = c1;
		account[1] = c2;
		account[2] = c3;

		AppTestAccountBank c1 = new AppTestAccountBank("N");
		account[0] = c1;

		AppTestAccountBank c2 = new AppTestAccountBank("E");
		account[1] = c2;

		AppTestAccountBank c3 = new AppTestAccountBank("E);
				account[2] = c3;

		System.out.println("Account Bank" + accounts);
		System.out.println("AccountID: " + accounts.getAccountID());
		System.out.println("Agency: " + accounts.getAgency());
		System.out.println("type: " + accounts.getType().equals("N") ? "Normal" : "Special");
		System.out.println("Number: " + accounts.getNumber());
		System.out.println("Balance: " + accounts.getBalance());

		System.out.println("Enter the Account ID of the bank for withdrawal");
		String AccountID = input.nextLine();

		int found = -1;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountID() == AccountID) {
				found = i;
				break;
			}
		}
		if (found == -1) {
			System.out.println("Enter the deposit");
			double deposit = input.nextDouble();
			accounts[found].registerDeposit(deposit) == ture {
				System.out.println("Deposit was made sucessfully");
				System.out.println("AccountID: " + accounts[found].getAccountID());
			}
		} else {
			System.out.println("Withdrawal was made sucessfully!");
		} else{
			System.out.println("Withdrawal was made insufficent!");
		} else{
			System.out.println("Account was not found!");
		}
	}
	input.close();
}
