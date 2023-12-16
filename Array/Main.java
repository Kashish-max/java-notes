package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

class ArrayCopyWithSystemObject {
    public static void copyArray() {
        int copyFrom[] = {1, 2, 3, 4, 5};
        int copyTo[] = new int[3];

        System.arraycopy(copyFrom, 2, copyTo, 0, 3);
        for(int i=0; i<copyTo.length; i++) {
            System.out.print(copyTo[i]+" ");
        }
        System.out.println();
    }
}

class ArrayManipulations {
    public static void copyArray() {
        int[] copyFrom = {1, 2, 3, 4, 5};
        int[] copyTo = Arrays.copyOfRange(copyFrom, 2, 5);

        for(int i=0; i<copyTo.length; i++) {
            System.out.print(copyTo[i]+" ");
        }
        System.out.println();
    }

    public static void searchArray() {
        String arr[] = {"a", "b", "c", "d", "e"};
        int index = Arrays.binarySearch(arr, "b");
        System.out.println(index);
    }

    public static void sortArray() {
        int arr[] = {5, 4, 3, 2, 1};
        Arrays.sort(arr, 0, 2);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void compareArray() {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3, 4, 5};

        if(Arrays.equals(arr1, arr2)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Dynamic initialization of array
        int[] test;
        test = new int[5];

        ArrayCopyWithSystemObject.copyArray();

        ArrayManipulations.copyArray();
        ArrayManipulations.searchArray();
        ArrayManipulations.sortArray();
        ArrayManipulations.compareArray();
    }
}
