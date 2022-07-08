package entities2;

public class NaturalPerson extends Person {

	private Double healthyExpenses;

	public NaturalPerson() {
		super();
	}

	public NaturalPerson(String name, Double annualIncome, Double healthyExpenses) {
		super(name, annualIncome);
		this.healthyExpenses = healthyExpenses;
	}

	public Double getHealthyExpenses() {
		return healthyExpenses;
	}

	public void setHealthyExpenses(Double healthyExpenses) {
		this.healthyExpenses = healthyExpenses;
	}

	@Override
	public double fee() {

		double naturalFee;

		if (healthyExpenses > 0) {

			if (anualIncomme < 20000) {
				naturalFee = (anualIncomme * 0.15) - (healthyExpenses * 0.5);
			} else {
				naturalFee = (anualIncomme * 0.25) - (healthyExpenses * 0.5);
			}

		} else {

			if (anualIncomme < 20000) {
				naturalFee = anualIncomme * 0.15;
			} else {
				naturalFee = anualIncomme * 0.25;
			}
		}

		return naturalFee;
	}

	@Override
	public String toString() {
		return name + ": $ " + String.format("%.2f", fee());
	}
	
}
