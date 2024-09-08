package kausik_khuntia_week03_assignment;

 abstract class shape {
	// Base class
	
	    abstract double calculateArea(); // Abstract method
	}

	// Derived class Circle
	class Circle extends shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	}

	// Derived class Rectangle
	class Rectangle extends shape {
	    private double width, height;

	    public Rectangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }

	    @Override
	    double calculateArea() {
	        return width * height;
	    }
	}

	// Derived class Triangle
	class Triangle extends shape {
	    private double base, height;

	    public Triangle(double base, double height) {
	        this.base = base;
	        this.height = height;
	    }

	    @Override
	    double calculateArea() {
	        return 0.5 * base * height;
	    }
	}

	public class Shape1 {
	    public static void main(String[] args) {
	        shape circle = new Circle(5);
	        shape rectangle = new Rectangle(4, 6);
	        shape triangle = new Triangle(3, 7);

	        System.out.println("Circle Area: " + circle.calculateArea());     // Circle Area: 78.54
	        System.out.println("Rectangle Area: " + rectangle.calculateArea()); // Rectangle Area: 24.0
	        System.out.println("Triangle Area: " + triangle.calculateArea());   // Triangle Area: 10.5
	    }
	}



