package fr.iutvalence.info.dut.m3105.preamble;

import java.awt.Color;

public class CircleBuilder {

	private Shape shape;
	
	public CircleBuilder(int radius) {
		shape = new Circle(radius);		
	}
	
	public CircleBuilder setColor(Color color){
		shape = new ShapeSolidFill(color, shape);
		return this;
	}
	
	public CircleBuilder setBorder(int thickness){
		shape = new ShapeBorder(thickness, shape);
		return this;
	}
	
	public CircleBuilder setShadow(int angle, int intensity){
		shape = new ShapeShadow(angle, intensity, shape);
		return this;
	}
	
	public Shape toShape(){
		return shape;
	}
	
}
