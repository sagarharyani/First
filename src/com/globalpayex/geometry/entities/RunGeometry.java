package com.globalpayex.geometry.entities;

import com.abc.geometry.ShapeStatistics;

public class RunGeometry {
	
	public static void main(String[] args) {
		Square sq = new Square(7);
		ShapeStatistics.print(sq);
		System.out.println("");
		Rectangle rt = new Rectangle(7, 8);
		ShapeStatistics.print(rt);
		System.out.println("");
		Circle ci = new Circle(7);
		ShapeStatistics.print(ci);
		
		
	}

}
