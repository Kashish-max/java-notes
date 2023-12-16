package Literals_Package;

public class Literals {
    public static void main(String... args) {
        int num1 = 5; // Decimal
        int num2 = 0b101; // Binary, For binary literals, use 0b or 0B as a prefix.
        System.out.println(num2);        
        int num3 = 0xB; // Hexadecimal, For hexadecimal literals, use 0x or 0X as a prefix.
        System.out.println(num3);

        // Use underscores to make the number more readable.
        int num4 = 10_000_000; // Underscores are ignored by the compiler.
        System.out.println(num4);

        double num5 = 3e4; // Scientific notation, 3 * 10^4
        System.out.println(num5);
    }
}