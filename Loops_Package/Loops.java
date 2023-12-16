package Loops_Package;

public class Loops {
    public static void main(String... args) {
        // Loops are same as in c++

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }

        i=0;
        for (; i<5;){
            System.out.println(i);
            i++;
        }

        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.println(num);
        }
    }    
}
