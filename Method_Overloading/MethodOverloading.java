package Method_Overloading;

// Static methods can be overloaded but the overlooading method must be static as well.
/* Static methods can't be overridden because overriding is based on dynamic binding at runtime 
and static methods are bonded using static binding at compile time. */

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println("The average of 3 numbers is: " + obj.average(3, 4));
        System.out.println("The average of 3 numbers is: " + obj.average(3.0, 4.0, 5.0));
    }

    public int average(int n1, int n2) {
        return (n1 + n2) / 2;
    }

    public double average(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}