package fr.iutvalence.info.dut.m3105.preamble;

public class ShapeComposing implements Figure{
	
	private Shape shape1;
	private Shape shape2;
	private Operation operation;
	
	public ShapeComposing(Shape shape1, Shape shape2, Operation operation) {
		this.shape1 = shape1;
		this.shape2 = shape2;
		this.operation = operation;
	}

}
