package com.globalpayex.geometry.entities;

import com.abc.geometry.entities.Shape;

public class Rectangle extends Shape {
	
	float length;
	float breadth;
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public float area() {
		return this.length * this.breadth;
	}
	
	public float perimeter() {
		return (2*length) + (2*breadth);
	}
	
	
	

}
