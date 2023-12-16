// String is a special data type in Java. It is not a primitive data type like int or double.
// String is basically a class in java.lang package.
// String is immutable. Once a String object is created, it cannot be modified.
// String x = "Hello"; x = "Hello" + " World"; // This is valid as it creates a new String object and references x is updated to point to the new object.

public class Strings {
    public static void main(String... args) {
        // String x = new String("Some String");
        String a = "Kashish";
        String b = "Arun";
        String c = a + " Goyal";
        String d = "Kashish";

        // Heap memory has a string constant pool. Strings are immutable.
        // when a string object is created, it is first checked if the string already exists in the pool.
        /* 
            On line 9, string "Kashish" is added to the string constant pool. for eg. 0x1234
            In stack memory, a reference to the string "Kashish" is made for variable a(a = 0x1234).
        */
        /*
            On line 10, string "Arun" is added to the string constant pool. for eg. 0x5678
            In stack memory, a reference to the string "Arun" is made for variable b(b = 0x5678).
        */
        /*
            On line 11, string "Kashish Goyal" is added to the string constant pool. for eg. 0x9abc
            In stack memory, a reference to the string "Kashish Goyal" is made for variable c(c = 0x9abc).
        */
        /*
            On line 12, string "Kashish" is already present in the string constant pool (0x1234)
            In stack memory, a reference to the string "Kashish" is made for variable d(d = 0x1234).
        */
        // Now a and d are pointing to the same string object in the string constant pool.
        // so a == d will return true.


        // String Buffer
        // String Buffer is mutable version of String. It is thread safe.
        StringBuffer sb = new StringBuffer("Kashish");
        sb.append(" Goyal");
        System.out.println(sb); // Kashish Goyal

        sb.deleteCharAt(3);
        System.out.println(sb); // Kashsh Goyal

        // String Builder
        // String Builder is similar to String Buffer but it is not thread safe.
        // String Builder is faster than String Buffer. So, if you are working in a single threaded environment, use String Builder.
        // In a multi-threaded environment, use String Buffer.
    }
}
