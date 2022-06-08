package com.globalpayex.geometry.entities;

import com.abc.geometry.entities.Shape;

public class Square extends Shape{
	int side;

	public Square(int side) {
		this.side = side;
	}
	
	public float area() {
		return this.side * this.side;
	}
	
	public float perimeter() {
		return 4*this.side;
	}
	
}
