package Static_Keyword;

// Ṭop-level/Outer class can't be static
// To create a static class we must create a nested class and then make it static
// Static members of a class can be accessed using outer class name without creating instance of outer class
// Non-static inner class can access both static and non-static members of outer class

public class StaticClass {
    public int a = 10;
    public static int b = 20;
    
    static class StaticNestedClass {
        void display() {
            System.out.println("Outer class static variable " + b);

            // System.out.println("Non-static variable " + a); // error: non-static variable a cannot be accessed in static class
            StaticClass obj = new StaticClass();
            System.out.println(obj.a);
        }
    }

    class InnerClass {
        void display() {
            System.out.println("Inner Class can access non-static variable a: " + a);
        }
    }
}
