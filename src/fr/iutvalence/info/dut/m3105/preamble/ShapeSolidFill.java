package fr.iutvalence.info.dut.m3105.preamble;

import java.awt.Color;

public class ShapeSolidFill extends Shape{
	
	private Shape shape;
	private Color color;
	
	
	public ShapeSolidFill(Color color , Shape shape) {
		this.shape = shape;
		this.color = color;
	}

	@Override
	public String toString() {
		return (shape.toString()+" solid fill : color = "+color+"\n");
	}

}
