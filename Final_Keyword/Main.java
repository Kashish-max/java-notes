package Final_Keyword;

// final class can't be inherited
// final method can't be overridden
// final variable can't be changed
// final variable must be initialized

public class Main {
    final int a = 10; // similar to const in C++

    public static void main(String[] args) {
        Main obj = new Main();
        // obj.a = 20; // error: cannot assign a value to final variable a
        System.out.println(obj.a);
    }
}
