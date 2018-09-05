package revise;

public class Printer3D extends PrintDecorator {

	public Printer3D(Printer decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("3D");
	    decoratedPrinter.print();
	}

}
