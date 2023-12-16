package Class_Object_Package;
// import Class_Object_Package.Calculator; // import is not required if both classes are in same package

import Static_Keyword.StaticBlock;
import Static_Keyword.StaticClass;
import Static_Keyword.StaticFunction;

public class Main {
    public static void main(String... args) {
        Calculator c = new Calculator();
        int res = c.add(3, 6);
        System.out.println(res);
    }
    
}
