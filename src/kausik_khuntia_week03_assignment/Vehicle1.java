package kausik_khuntia_week03_assignment;

 class vehicle {
	// Base class
	
	    public void start() {
	        System.out.println("Vehicle is starting...");
	    }
	}

	// Derived class Car
	class Car extends vehicle {
	    @Override
	    public void start() {
	        System.out.println("Car is starting...");
	    }
	}

	// Derived class Bike
	class Bike extends vehicle {
	    public void start() {
	        System.out.println("Bike is starting...");
	    }
	}

	public class Vehicle1 {
	    public static void main(String[] args) {
	        // Polymorphism in action
	        Car myCar = new Car(); // Vehicle reference, Car object
	        Bike myBike = new Bike(); // Vehicle reference, Bike object
	        
	        myCar.start(); // Output: Car is starting...
	        myBike.start(); // Output: Bike is starting...
	    }
	}



