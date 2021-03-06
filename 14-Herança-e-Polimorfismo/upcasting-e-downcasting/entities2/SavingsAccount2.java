package entities2;

import entities3.Account3;

public class SavingsAccount2 extends Account3{
	
	private Double interestRate;
	
	public SavingsAccount2() {
		super();
	}

	public SavingsAccount2(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance () {
		balance += balance * interestRate;
	}

}
