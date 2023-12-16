package Method_Overriding;

// *Upcasting and Downcasting are used in Runtime Polymorphism*
// Refer to line 84 for Upcasting.

// Overriding is used to provide specific implementation of a method that is already provided by its super class.
// To override, the method in subclass must have same name, same parameters and same return type as the method in super class.
// @Override annotation is not mandatory to override a method but it is good practice to use it.
/* If there is no method with same signature in super class then 
@Override annotation will give error instead of initializing a new method with the mistaken name or parameters. */
// If you are using @Override annotation then you won't be able to overload the method.

// Static methods can be overloaded but the overloading method must be static as well.
/* Static methods can't be overridden because overriding is based on dynamic binding at runtime 
and static methods are bonded using static binding at compile time. */

// Access modifiers of overridden method can't be more restrictive but can be less restrictive.
// protected method of super class can be overridden with protected or public access modifier.
// default method of super class can be overridden with default, protected or public access modifier.
// public method of super class can be overridden with only public access modifier.

class A {
    public void show1() {
        System.out.println("In A");
    }

    protected void show2() {
        System.out.println("In A");
    }

    // public void show3() {}

    public void show4() {
        System.out.println("In A");
    }    
}

class B extends A {
    // @Override
    public void show1() {
        System.out.println("show1 method overridden in B");
    }

    // @Override
    // public int show1() { // error: return type int is not compatible with void
    //     System.out.println("In B");
    //     return 0;
    // }

    // show method is not overridden but overloaded.
    // @Override // using @Override annotation will give error as the method does not have same parameters as the method in super class.
    public void show1(int a) {
        System.out.println("show1 method overloaded in B");
    }
}

class C extends A {

    // protected method of super class overridden with public access modifier.
    @Override
    public void show2() {
        System.out.println("Protected method of A is overridden in C with public access modifier");
    }

    // @Override // error: show2() in C cannot override show2() in A; attempting to assign weaker access privileges; was protected
    // private void show2() { 
    //     System.out.println("Protected method of A is overridden in C with private access modifier");
    // }
    
}

class Polymorphism extends A{
    public void show3() {
        System.out.println("In Polymorphism");
    }

    public void show4() {
        System.out.println("In Polymorphism");
    }
}


public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.show1();

        C obj2 = new C();
        obj2.show2();

        // Runtime Polymorphism
        // Child class object reference is stored in parent class type variable. This is called **UPCASTING**.
        // Any method called using parent class type variable will call the method of child class if it is overridden.
        // You can only call methods that are present in parent class using parent class type variable.
        // obj3 basically is an object of Polymorphism class but it is stored in A type variable.
        A obj3 = new Polymorphism();
        obj3.show3(); // error: cannot find symbol, show3() is present in Polymorphism class not in A class.
        // You can't call show3() method using obj3 as it is not present in A class.
        // This way we can restrict the access to methods of child class using parent class type variable.
        // User can only call methods that are present in parent class but can have access to some child class implementations.
        obj3.show4(); // In Polymorphism, you can call show4() method using obj3 as it is overridden in Polymorphism class.

        // To remove the restriction of calling only parent class methods, we can use **DOWNCASTING**.
        // obj3 is of type A but it is actually an object of Polymorphism class. So we can downcast it to Polymorphism class.
        Polymorphism obj4 = (Polymorphism) obj3;
        // obj4 is basically an instance of Polymorphism class.

        obj3.show1(); // In A
        // This type of tecgnique can be also be used to pass different objects of same type to a method.
        // If we have objects of different classes but all of them are inherited from same class then we can pass them to a method using parent class type variable.
        // no matter obj3 is of which child class, it will have type of A only.
        checkPolymorphism(obj3);

        A obj5 = new B();
        obj5.show1(); 
        // obj5.show1(3); // error: cannot find symbol, show1(int) is present in B class not in A class.

        
    }

    public static void checkPolymorphism(A obj) {
        // obj is of type A but it is actually an object of Polymorphism class.
        // similarly we can pass objects of different classes but all of them will have type of A only.
        obj.show4();
    }
}
