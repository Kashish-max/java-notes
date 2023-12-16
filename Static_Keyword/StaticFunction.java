package Static_Keyword;

public class StaticFunction {
    int x = 123;
    static int y = 456; 

    static void display() {
        // System.out.println("Static function" + x); // error: non-static variable x cannot be accessed in static context
        System.out.println("Static function can access only static variable y: " + y);
    }
}
