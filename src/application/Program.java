package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char opcao = sc.next().charAt(0);
		if ( opcao == 'y' ) {
			System.out.print("Enter initital deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(numberAccount, name, initialDeposit);
		} else {
			account = new Account(numberAccount, name);
		}
		
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.depositAccount(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawtValue = sc.nextDouble();
		account.saqueAccount(withdrawtValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}

}
