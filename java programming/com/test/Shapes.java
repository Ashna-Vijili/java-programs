package com.test;

import com.shape.Rectangle;
import com.shape.Square;

public class Shapes {

	public static void main(String[] args) {
		Square s=new Square();
		Rectangle r=new Rectangle();
		s.side=3;
		s.calcArea();
		s.calcPeri();
		
		r.length=2;
		r.breadth=3;
		
		r.calcArea();
		r.calcPeri();
		
	}

}
