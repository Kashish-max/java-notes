package Interface;

// Interface is a blueprint of a class
// Interface can't be instantiated
// Interface can't have constructor
// By default, all methods in interface are public and abstract
// By default, all variables in interface are public, static and final

// class -> class: extends
// interface -> interface: extends
// class -> interface: implements

interface Bicycle {
    // int a; // error: variable a not initialized in the default constructor
    int numOfGears = 10; // final variable must be initialized

    void changeGear(int a);
    void speedUp(int a);
}


interface Bicycle2 {
    void applyBrake(int decrement);
}

interface Bicycle3 {
    void jump();
}
interface Bicycle4 extends Bicycle3 {}

class BicycleImpl implements Bicycle, Bicycle2, Bicycle4 {
    int gear;
    int speed;

    @Override
    public void changeGear(int a) {
        gear = a;
    }

    @Override
    public void speedUp(int a) {
        speed += a;
    }

    @Override
    public void applyBrake(int decrement) {
        speed -= decrement;
    }   

    @Override
    public void jump() {
        System.out.println("Jumping...");
    }

    public void print() {
        System.out.println("Number of gears: " + numOfGears);
        System.out.println("Gear: " + gear + "\nSpeed: " + speed);
    }
}

public class Main {
    public static void main(String[] args) {
        BicycleImpl b = new BicycleImpl();

        b.changeGear(2);
        b.speedUp(3);
        b.print();

        // b.numOfGears; // error: numOfGears has protected access in Bicycle
        System.out.println("Number of gears: " + Bicycle.numOfGears);
    }
}
