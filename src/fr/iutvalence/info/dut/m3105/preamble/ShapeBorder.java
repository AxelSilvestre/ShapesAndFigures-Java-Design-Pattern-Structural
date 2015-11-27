package fr.iutvalence.info.dut.m3105.preamble;

public class ShapeBorder extends Shape{
	
	private Shape shape;
	private int thickness;
	
	
	public ShapeBorder(int thickness, Shape shape) {
		this.thickness = thickness;
		this.shape = shape;
	}

	@Override
	public String toString() {
		return (shape.toString()+" border : thickness = "+thickness+"\n");
	}

}
