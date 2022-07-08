package entities;

import entities.enums.Color;

public class Rectangle extends Shape{

	protected Double width;
	protected Double height;
	

	public Rectangle() {
		super();
	}
	
	public Rectangle(Color color, Double widht, Double height) {
		super(color);
		this.width = widht;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
}
