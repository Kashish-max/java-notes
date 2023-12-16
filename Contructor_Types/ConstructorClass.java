package Contructor_Types;

// we can't use static, final, abstract, synchronized, native, and strictfp modifiers with a constructor
// we can use access modifiers with a constructor - public, private, protected, default

public class ConstructorClass {
    ConstructorClass() {
        System.out.println("Default constructor");
    }

    ConstructorClass(int a) {
        System.out.println("Parameterized constructor with a = " + a);
    }

    ConstructorClass(int a, int b) {
        System.out.println("Constructor Overloading with a = " + a + " and b = " + b);
    }
}
