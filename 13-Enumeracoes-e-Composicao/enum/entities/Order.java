package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	
	private Integer idInteger;
	private Date moment;
	private OrderStatus status;
	
	public Order() {
	}

	public Order(Integer idInteger, Date moment, OrderStatus status) {
		this.idInteger = idInteger;
		this.moment = moment;
		this.status = status;
	}

	public Integer getIdInteger() {
		return idInteger;
	}

	public void setIdInteger(Integer idInteger) {
		this.idInteger = idInteger;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [idInteger=" + idInteger + ", moment=" + moment + ", status=" + status + "]";
	}

}
