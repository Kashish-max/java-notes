// There can be only one public class in a file that contains a main method.
// The name of the file should match the name of the public class and have a .java extension.
// If there is only one class in a file, it does not have to be public.
// main method must be public, static, void, and have a String array as a parameter.
/* static means that the method belongs to the class and not an instance of the class. 
The method can be called without creating an instance of the class. It is similar to @staticmethod in Python. */
// main method has to be public so that JVM can execute it from outside the class.
// main method has to be static so that JVM can call it without instantiating the class.
// main method must have String[] as a parameter so that JVM can pass the arguments to the method.
// String[] args and String args[] and String... args are all valid ways to declare an array of Strings.

package Hello_Package;

public class Hello {
    public static void main(String[] args) {
        String x;
        x = "Hello";
        System.out.print(x);
        // print() does not add a new line at the end of the output. 
        
        System.out.println(x);
        System.out.println(x);
    }
}
