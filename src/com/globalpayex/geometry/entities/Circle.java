package com.globalpayex.geometry.entities;

import com.abc.geometry.entities.Shape;

public class Circle extends Shape {

	int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public float area() {
		return (float) (Math.PI*radius*radius);
	}
	
	public float perimeter() {
		return (float) (Math.PI*radius);
	}
}
