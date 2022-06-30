package entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double value;
	private Integer hours;
	
	public HourContract() {
	}

	public HourContract(Date date, Double value, Integer hours) {
		this.date = date;
		this.value = value;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		
		return value * hours;
		
	}

}
