package FactoryDesignPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory sf=new ShapeFactory();
		Shape s = sf.getShape("square");
		s.draw();
	}

}
