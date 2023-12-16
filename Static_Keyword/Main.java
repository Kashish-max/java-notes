package Static_Keyword;

// Static methods can be overloaded but the overlooading method must be static as well.
/* Static methods can't be overridden because overriding is based on dynamic binding at runtime(runtime polymorphism)
and static methods are bonded using static binding at compile time. */

public class Main {
    public static void main(String... args) throws ClassNotFoundException {
        // nested static class instantiation
        StaticClass.StaticNestedClass StaticNestedClassInstance = new StaticClass.StaticNestedClass();
        StaticNestedClassInstance.display();

        // nested non-static class instantiation
        StaticClass OuterClassInstance = new StaticClass();
        StaticClass.InnerClass InnerClassInstance = OuterClassInstance.new InnerClass();
        InnerClassInstance.display();
        
        // example of how changing static variable of one instance changes it for all instances
        StaticClass OuterClassInstance2 = new StaticClass();
        System.out.println(OuterClassInstance.a);
        OuterClassInstance.b = 30;
        OuterClassInstance2.b = 40;
        System.out.println(OuterClassInstance.b); // 40
        System.out.println(OuterClassInstance2.b); // 40
        
        // static function class
        StaticFunction.display();

        // static block class
        Class.forName("Static_Keyword.StaticBlock"); // This will load the class and execute the static block without instantiating the class.
    }
}
