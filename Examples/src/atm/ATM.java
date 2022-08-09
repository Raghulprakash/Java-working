package atm;

import java.util.*;

public class ATM {

	public static void main(String[] args) {
		int balance = 100000, withdraw, deposit;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Welcome to Indian Overseas Bank");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for EXIT");
			System.out.print("Choose the operation you want to perform:");
			int choice = sc.nextInt();
			switch (choice) {
			
			case 1:
				
				System.out.print("Enter money to be withdrawn:");
				withdraw = sc.nextInt();
				if (balance >= withdraw) {
					balance = balance - withdraw;
					System.out.println("Please collect your money:" + withdraw);
					System.out.println("Your Account Balance:" + balance);
				} else {
					System.out.println("Insufficient Balance");
				}
				System.out.println("");
				break;

			case 2:

				System.out.print("Enter money to be deposited:");
				deposit = sc.nextInt();
				System.out.println("Your Account Balance:" + balance);
				balance = balance + deposit;
				System.out.println("Your Money has been successfully depsited");
				System.out.println("Your Current Account Balance:" + balance);
				System.out.println("");
				break;

			case 3:
				System.out.println("Balance : " + balance);
				System.out.println("");
				break;

			case 4:
				System.out.println("Thankyou");
				System.exit(0);
			default:
				System.out.println("******Error******");
				
			}
		}

	}
}