package fr.iutvalence.info.dut.m3105.preamble;

import java.awt.Color;

public class RectangleBuilder {
	
	private Shape shape;
	
	public RectangleBuilder(int width, int height) {
		shape = new Rectangle(width, height);		
	}
	
	public RectangleBuilder setColor(Color color){
		shape = new ShapeSolidFill(color, shape);
		return this;
	}
	
	public RectangleBuilder setBorder(int thickness){
		shape = new ShapeBorder(thickness, shape);
		return this;
	}
	
	public RectangleBuilder setShadow(int angle, int intensity){
		shape = new ShapeShadow(angle, intensity, shape);
		return this;
	}
	
	public Shape toShape(){
		return shape;
	}

}
