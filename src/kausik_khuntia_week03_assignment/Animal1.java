package kausik_khuntia_week03_assignment;


	// Abstract class
	abstract class Animal {
	    public abstract void sound(); // Abstract method

	    public void sleep() {
	        System.out.println("The animal is sleeping...");
	    }
	}

	// Interface
	interface Pet {
	    void play();
	}

	// Dog class extends Animal and implements Pet
	class Dog extends Animal implements Pet {
	    @Override
	    public void sound() {
	        System.out.println("Dog barks");
	    }

	    @Override
	    public void play() {
	        System.out.println("Dog is playing...");
	    }
	}

	// Cat class extends Animal and implements Pet
	class Cat extends Animal implements Pet {
	    @Override
	    public void sound() {
	        System.out.println("Cat meows");
	    }

	    @Override
	    public void play() {
	        System.out.println("Cat is playing...");
	    }
	}

	public class Animal1 {
	    public static void main(String[] args) {
	        Animal dog = new Dog();
	        Animal cat = new Cat();
	        
	        dog.sound(); // Output: Dog barks
	        dog.sleep(); // Output: The animal is sleeping...
	        
	        Pet petDog = new Dog();
	        petDog.play(); // Output: Dog is playing...
	        
	        Pet petCat = new Cat();
	        petCat.play(); // Output: Cat is playing...
	    }
	}



