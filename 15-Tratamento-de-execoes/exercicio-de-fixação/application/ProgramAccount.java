package application;

import java.util.Scanner;

import model.entities.Account;
import model.excepitons.DomainException;

public class ProgramAccount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Enter account data");

			System.out.print("Number: ");
			Integer number = sc.nextInt();

			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();

			System.out.print("Initial balance: ");
			Double initBalance = sc.nextDouble();

			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();

			Account acc = new Account(number, holder, initBalance, withdrawLimit);

			System.out.println();

			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();

			acc.withdraw(amount);

			System.out.println("New balance: " + acc.getBalance());

		} catch (DomainException e) {

			System.out.println("Withdraw error: " + e.getMessage());

		} catch (RuntimeException e) {

			System.out.println("Unexpected Error");

		}

		sc.close();
	}

}
