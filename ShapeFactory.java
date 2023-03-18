package FactoryDesignPattern;

public class ShapeFactory {
	Shape getShape(String input)
	{
		switch(input) {
		case "Circle":
			return new circle();
		case "square":
			return new square();
		default:
			return null;
		}
	}

}
