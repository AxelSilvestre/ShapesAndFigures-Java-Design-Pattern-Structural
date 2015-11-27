package fr.iutvalence.info.dut.m3105.preamble;

public class ShapeShadow extends Shape{
	
	private Shape shape;
	private int angle;
	private int intensity;
	
	
	public ShapeShadow(int angle, int intensity, Shape shape) {
		this.shape = shape;
		this.angle = angle;
		this.intensity = intensity;
	}

	@Override
	public String toString() {
		return (shape.toString()+" shadow : angle = "+angle+", intensity = "+intensity+"\n");
	}
	
}
