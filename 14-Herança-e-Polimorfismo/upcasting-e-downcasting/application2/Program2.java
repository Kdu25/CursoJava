package application2;

import entities3.Account3;
import entities3.BusinessAccount3;
import entities3.SavingsAccount3;

public class Program2 {

	public static void main(String[] args) {

		
		Account3 acc = new Account3(1001, "Alex", 0.0);
		BusinessAccount3 bacc = new BusinessAccount3(1002, "Maria", 0.0, 500.0);
		
		
		// UPCASTING

		Account3 acc1 = bacc;
		Account3 acc2 = new BusinessAccount3(1003, "Bob", 0.0, 200.0);
		Account3 acc3 = new SavingsAccount3(1004, "Anna", 0.0, 0.01);
		
		System.out.println(acc.getBalance());
		System.out.println(acc1.getBalance());
		
		// DOWNCASTING
		
		BusinessAccount3 acc4 = (BusinessAccount3) acc2;
		acc4.loan(100.0);
		
		// BusinessAccount2 acc5 = (BusinessAccount2) acc3;
		
		if (acc3 instanceof BusinessAccount3) {
			BusinessAccount3 acc5 = (BusinessAccount3) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount3) {
			SavingsAccount3 acc5 = (SavingsAccount3) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
	}

}
