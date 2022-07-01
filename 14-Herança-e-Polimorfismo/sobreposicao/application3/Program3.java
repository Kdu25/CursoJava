package application3;

import entities3.Account3;
import entities3.BusinessAccount3;
import entities3.SavingsAccount3;

public class Program3 {

	public static void main(String[] args) {

		
		Account3 acc1 = new Account3(1001, "Alex", 1000.0);
		acc1.withdraw(200);
		
		System.out.println(acc1.getBalance());
		
		
		Account3 acc2 = new SavingsAccount3(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200);
		
		System.out.println(acc2.getBalance());

		Account3 acc3 = new BusinessAccount3(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200);
		
		System.out.println(acc3.getBalance());
		
	}

}
