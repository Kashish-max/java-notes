package Contructor_Types;

// super() helps to decide which constructor of parent class to call inside subclass when there are multiple constructors in the parent class
// super() can only be used inside constructor of subclass
// super() must be the first statement inside constructor of subclass
// super() can only be called once inside constructor of subclass 
// Every constructor of subcalss have super() by default as the first statement even if it is not written explicitly

public class SuperClass {
    SuperClass () {
        System.out.println("SuperClass constructor");
    }

    SuperClass (int a) {
        System.out.println("SuperClass constructor with one argument a = " + a);
    }
}

class SubClass extends SuperClass {
    SubClass () {
        System.out.println("SubClass constructor");
    }

    SubClass (int x) {
        super(x);
        System.out.println("SubClass constructor with one argument x = " + x);
    }
}