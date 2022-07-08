package entities2;

public class LegalPerson extends Person {

	private int employees;

	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double rendaAnual, int employees) {
		super(name, rendaAnual);
		this.employees = employees;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	@Override
	public double fee() {

		double legalFee;

		if (employees > 10) {
			legalFee = anualIncomme * 0.14;
		} else {
			legalFee = anualIncomme * 0.16;
		}

		return legalFee;
	}
	
	@Override
	public String toString() {
		return name + ": $ " + String.format("%.2f", fee());
	}

}
