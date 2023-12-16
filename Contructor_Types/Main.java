package Contructor_Types;

public class Main {
    public static void main(String[] args) {
        ConstructorClass obj1 = new ConstructorClass();
        ConstructorClass obj2 = new ConstructorClass(10);
        ConstructorClass obj3 = new ConstructorClass(10, 20);

        // PrivateConstructor obj4 = new PrivateConstructor(); // error: class with private constructor can't be instantiated outside the class

        // Class with private constructor
        ClassOfStatics.MathUtil1();
        ClassOfStatics.MathUtil2();

        // Class with private constructor and final keyword
        System.out.println("Constant 1 of Constants class: " + Constants.constant1);
        System.out.println("Constant 2 of Constants class: " + Constants.constant2);
        
        // Singleton class
        Singleton singleton  = Singleton.getInstance();

        // Singleton class with lazy initialization
        SingletonLazy singletonLazy = SingletonLazy.getInstance();

        // Singleton Logger class
        Logger logger = Logger.getInstance();
        logger.log("I am a logger");

        // Super class and sub class
        SubClass subClass = new SubClass();
        SubClass subClass1 = new SubClass(5);
    }
}
