package Primitive_Data_Types;

public class Datatypes {
    int classVariable; // class scoped variables are initialized to 0 by default

    public static void main(String[] args){
        Datatypes obj = new Datatypes();
        System.out.println(obj.classVariable); // 0

        // static int staticVariable; // error: static keyword can be used only in a 'class scope'

        int num1 = 5; // 4 bytes
        short num2 = 5; // 2 bytes
        byte num3 = 5; // 1 byte
        long num4 = 5; // 8 bytes
        System.out.println(num4);

        // why use l or L at the end of long?
        // long num5 = 2147483648; // error: integer number too large: 2147483648
        // by default, java treats long as int
        long num5 = 2147483648L;
        System.out.println(num5);

        double num6 = 5.5; // 8 bytes
        float num7 = 5.5f; // 4 bytes, use f or F at the end of float otherwise error

        char c = 'A'; // 2 bytes
        // characters can be treated as integers in java
        c++;
        System.out.println(c); // B
        char c1 = 65;
        System.out.println(c1); // A

        boolean b = true; // 1 bit
        // boolean is strictly true or false in java, not 0 or 1
        // boolean b = 1; // error: incompatible types: int cannot be converted to boolean
    }
}

// Default values of primitive data types for local variables result in compilation error
// Default values of primitive data types for global variables:
// byte, short, int, long: 0
// float, double: 0.0
// char: '\u0000' (null character)
// boolean: false