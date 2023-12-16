package Abstract;

// Abstraction is a process of hiding the implementation details and showing only functionality to the user.
// Abstraction lets you focus on what the object does instead of how it does it.
// It is similar to interfaces in Java.

// Only an abstract class can have abstract methods
// An abstract class cannot be instantiated
// An abstract class can have everything that a normal class has.
// An abstract class can have both abstract and non-abstract methods
// An abstract class can have final, non-final, static and non-static variables

// Every abstract method in the parent class must be implemented in the child class or else the child class must be declared abstract.

// If a class is not abstract, it is called a concrete class.

abstract class Car {
    void playMusic() {
        System.out.println("Playing music");
    }

    // This is called method declaration
    // You can only declare methods with abstract keyword
    abstract void drive();
    abstract void startEngine();
}

class Mercedes extends Car {
    @Override
    void drive() {
        System.out.println("Driving Mercedes");
    }

    @Override
    void startEngine() {
        System.out.println("Starting Mercedes engine");
    }
}

abstract class BMW extends Car {
    // If we don't implement all the abstract methods of the parent class, then we must declare this class as abstract

    @Override
    void startEngine() {
        System.out.println("Starting BMW engine");
    }
}

class BMWX5 extends BMW {

    @Override
    void drive() {
        System.out.println("Driving BMW X5");
    }

    void fly() {
        System.out.println("Flying BMW X5");
    }
}

public class Main {
    public static void main(String... args) {
        Mercedes mercedes = new Mercedes();
        mercedes.playMusic();
        mercedes.drive();
        mercedes.startEngine();
        
        BMWX5 bmwx5 = new BMWX5();
        bmwx5.playMusic();
        bmwx5.drive();
        bmwx5.startEngine();

        // BMW bmw = new BMW(); // This will give an error because we cannot instantiate an abstract class
        BMW  bmw = new BMWX5();
        bmw.playMusic();
        bmw.startEngine();
        bmw.drive();

        // bmw.fly(); // This will give an error because the reference is of type BMW and not BMWX5

    }
}
