package com.shape;

public class Rectangle implements Polygon{

			public float length;
		public float breadth;
			@Override
			public void calcArea() {
				float c=length*breadth;
			System.out.println("area of the rectangle is " +c);
				
			}

			@Override
			public void calcPeri() {
				float d=((2*length)+(2*breadth));
			System.out.println("perimeter of the rectangle is " +d);
				
			}
			
		}

