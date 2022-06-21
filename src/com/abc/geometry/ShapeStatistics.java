package com.abc.geometry;

import com.abc.geometry.entities.Shape;

public class ShapeStatistics {
	
	public static void print(Shape sh) {
		System.out.println("***********Statistics*************");
		System.out.println(String.format("Area is %s", sh.area()));
		System.out.println(String.format("Perimeter is %s", sh.perimeter()));
		System.out.println("***********Statistics*************");
	}

}
