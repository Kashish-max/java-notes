package IF_ELSE_Package;

public class If_Else {
    public static void main(String... args) {

        // if else is same as c++
        int y = 5;
        if (y > 0) {
            System.out.println("y is positive");
        } else if (y < 0) {
            System.out.println("y is negative");
        } else {
            System.out.println("y is zero");
        }

        // switch case is same as c++
        int x = 7;
        switch (x) {
            case 1: {
                System.out.println("x is 1");
                break;
            }
            case 2:
                System.out.println("x is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("x is 3 or 4 or 5");
                break;
            case 6, 7, 8:
                System.out.println("x is 6 or 7 or 8");
                break;
            default:
                System.out.println("x is neither of cases");
        }
        // curly braces define a block scope for a case, otherwise the variables defined in a case will be available in the next case

        // switch using arrow instead of colon to avoid break statement in every case
        // but with this, you can't have multiple statements in a case
        switch (x) {
            case 1 -> System.out.println("x is 1");
            case 2 -> System.out.println("x is 2");
            case 3, 4, 5 -> System.out.println("x is 3 or 4 or 5");
            case 6, 7, 8 -> System.out.println("x is 6 or 7 or 8");
            default -> System.out.println("x is neither of cases");
        }
    }
}