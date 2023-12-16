package Contructor_Types;

public class PrivateConstructor {
    private PrivateConstructor() {
        System.out.println("Private constructor");
    }

    void display() {
        System.out.println("Display method");
    }

    void run() {
        PrivateConstructor obj = new PrivateConstructor();
        obj.display();
    }
}

// private constructor is used to restrict the instantiation of the class as it only contains static members
class ClassOfStatics {
    private ClassOfStatics() {}

    static void MathUtil1() {
        System.out.println("MathUtil 1 static method");
    }
    static void MathUtil2() {
        System.out.println("MathUtil 2 static method");
    }
}

// private constructor is used to restrict the instantiation and inheritence of the class as it only contains constants that can be used as global constants
final class Constants {
    static final int constant1 = 10;
    static final int constant2 = 20;

    private Constants(){}
}


// Singleton class is a class that can have only one object (an instance of the class) at a time.
class Singleton {
    private static Singleton obj = new Singleton();
    private Singleton() {}

    public static Singleton getInstance() {
        return obj;
    }
} 

// Singleton class with lazy initialization
class SingletonLazy {
    private static SingletonLazy obj;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        if (obj == null) {
            obj = new SingletonLazy();
        }
        return obj;
    }
}

// Singleton class Logger example
class Logger {
    private static Logger obj;

    private Logger() {}

    public static Logger getInstance() {
        if (obj == null) {
            obj = new Logger();
        }
        return obj;
    }

    public void log(String msg) {
        System.out.println(msg);
    }
}

