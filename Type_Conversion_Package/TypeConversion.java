package Type_Conversion_Package;

// Explicit type conversion is called type casting.
public class TypeConversion {
    public static void main(String... args) {
        // Widening Casting (automatically/Implicit) - assigning a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        int x = 23;
        // byte y = x; // error: as byte is smaller than int
        byte y = (byte) x;
        System.out.println(y);
        // byte range: -128 to 127, 256 values
        // If you try to assign a value that is out of range for the type, it will use the concept of modulo arithmetic to fit the value into the range.
        int x2 = 257;
        byte y2 = (byte) x2; // output: 257 % 256 = 1
        System.out.println(y2); // error: as byte is smaller than int

        // Narrowing Casting (manually/Explicit) - assigning a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte
        double myDouble1 = 9.78;
        int myInt1 = (int) myDouble1; // Manual casting: double to int
        System.out.println(myDouble1);   // Outputs 9.78
        System.out.println(myInt1);      // Outputs 9

        char x3 = 'A';
        double y3 = 65.0;
        boolean z3 = x3==y3;
        System.out.println(z3); // true

        int a = 4;
        String s = "EWR " + a;
        System.out.println(s);
    }
}