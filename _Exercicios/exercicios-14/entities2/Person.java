package entities2;

public abstract class Person {

	protected String name;
	protected Double anualIncomme;

	public Person() {
	}

	public Person(String name, Double anualIncomme) {
		super();
		this.name = name;
		this.anualIncomme = anualIncomme;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncomme() {
		return anualIncomme;
	}

	public void setAnualIncomme(Double anualIncomme) {
		this.anualIncomme = anualIncomme;
	}

	public abstract double fee();

}
