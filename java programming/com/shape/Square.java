package com.shape;

interface Polygon
{
	void calcArea();
	void calcPeri();
}
public class Square implements Polygon {

	public float side;
	@Override
	public void calcArea() {
		float a=side*side;
	System.out.println("area of the square is " +a);
		
	}

	@Override
	public void calcPeri() {
		 float b=4*side;
		System.out.println("perimeter of the square is " +b);
		
	}
	
}

