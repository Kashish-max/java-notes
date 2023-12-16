package Anonymous_Class;

// Anonymous class is a class that is declared without a name.
// It is used to override a method of a class or an interface without creating a new class.
// You can have your own method implementation in the anonymous class.

class ClassToOverride {
    void display() {
        System.out.println("Anonymous class");
    }
}

class OverriddenClassToOverride extends ClassToOverride {
    void display() {
        System.out.println("Overridden Anonymous class with a new class");
    }
}

abstract class AbstractClass {
    abstract void display();
}

public class Main {
    public static void main(String... args) {
        ClassToOverride obj = new OverriddenClassToOverride();
        obj.display();

        // The OverriddenClassToOverride has only one purpose and that is to override the display() method of the ClassToOverride class.
        // So we can use AnonymousClass to override the display() method of the ClassToOverride instead of creating a new class.  
        // Note: obj2 is not an instance of ClassToOverride, it is an instance of an Anonymous class that extends ClassToOverride.
        ClassToOverride obj2 = new ClassToOverride() {
            void display() {
                System.out.println("Overridden Anonymous class with Anonymous class");
            }
        };
        obj2.display();

        AbstractClass obj3 = new AbstractClass() {
            void display() {
                System.out.println("Overridden Anonymous class with Anonymous class");
            }
        };

        obj3.display();
    }
}
