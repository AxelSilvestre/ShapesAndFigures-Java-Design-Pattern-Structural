package fr.iutvalence.info.dut.m3105.preamble;

import java.awt.Color;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		Location location = new Location(3, 3);
		
		// Preamble
		Shape s1 = new Rectangle(2, 2);
		s1.draw(new Location(1, 1));
		
		Shape s2 = new Circle(2);
		s2.draw(new Location(3, 3));
		
		
		// Decorator
		Shape s3 = new ShapeBorder(3, s1);
		s3.draw(new Location(1, 1));
		
		Shape s4 = new ShapeSolidFill(Color.RED, 
						new ShapeBorder(5, 
								new ShapeShadow(4, 2, 
										new Rectangle(7, 7))));
		s4.draw(location);
		
		
		// Builder
		Shape s5 = new CircleBuilder(5)
		.setColor(Color.RED)
		.setShadow(6, 2)
		.setBorder(6)
		.toShape();
		
		s5.draw(location);
		
		Shape s6 = new RectangleBuilder(5,5)
		.setColor(Color.RED)
		.setShadow(6, 2)
		.setBorder(6)
		.toShape();
		
		s6.draw(location);
		
		
		// Composite
		
		
		
	}

}
