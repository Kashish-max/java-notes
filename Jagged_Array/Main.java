package Jagged_Array;

class Student {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
}

public class Main {
    public static void main(String... args) {
        // Array of objects
        Student[] students = new Student[3];
        students[0] = new Student(1, "A");
        students[1] = new Student(2, "B");
        students[2] = new Student(3, "C");

        for(Student student: students) {
            System.out.println(student.name + ": " + student.rollno);
        }        

        // Jagged Array
        int[][] arr = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[2];
        arr[2] = new int[3];

        int count = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
