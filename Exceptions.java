/*
 * Exceptions.java
 * Throwable is the parent class of all exceptions and errors.
 * |--Throwable--|
 * |--Error--|--Exception--|
 * |--OutOfMemoryError, StackOverflowError, VirtualMachineError, ThreadDeath--| |--Checked, Unchecked--|
 * 
 * |--Checked, Unchecked--|
 * |--IOException, SQLException--| |--RuntimeException: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException--|
 */

// Errors are not handled by the program. They are caused by the environment in which the application is running.
// Exceptions are handled by the program. They are caused by the application itself.
// Checked exceptions are checked at compile time. Unchecked exceptions are checked at runtime.
// You are forced to handle checked exceptions. You are not forced to handle unchecked exceptions.


class CustomException extends Exception {
    CustomException(String s) {
        super(s);
    }
}

public class Exceptions {
    public static void main(String[] args) {
        int zero = 0;
        int a = 10;
        int result;

        try {
            result = a / zero;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally");
        }

        try {
            if(zero == 0) {
                throw new CustomException("My custom exception");
                // throw new ArithmeticException("My custom arithmetic exception");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }    
    }
}
