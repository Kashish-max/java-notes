package Object_Class;

// Every class in Java extends the Object class implicitly.
// Object class has some methods that are inherited to all the classes in Java.
// Some of these methods are:
// 1. toString()
// 2. equals()
// 3. hashCode()

// Ṭhe hashcode is the hexadecimal representation of the memory address of the object.
// The toString() method returns the string representation of the object which is the combination of class name, @ symbol and the hashcode of the object.
// The equals() method compares the memory addresses of the objects and returns true if they are equal and false if they are not equal.

// Class without overriding any default methods of Object class
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name; this.age = age;
    }
}

// Class overriding some default methods of Object class
class Fruit {
    private String name;
    private String color;

    public Fruit(String name, String color) {
        this.name = name; this.color = color;
    }

    // Overriding the toString() method
    // Easy way to ovveride default methods:
    // 1. Right click on the class name
    // 2. Select Source -> Generate toString()...
    @Override
    public String toString() {
        return "Fruit [name=" + name + ", color=" + color + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    // Overriding the equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fruit other = (Fruit) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        return true;
    }    
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Kashish", 22);
        Student s2 = new Student("Arun", 23);

        boolean result = s1.equals(s2);
        System.out.println(result); // false as the memory addresses of the objects are different

        Fruit f1 = new Fruit("Apple", "Red");
        Fruit f2 = new Fruit("Apple", "Red");

        result = f1.equals(f2);
        System.out.println(result); // true as the equals() method is overridden which compares the values of the objects instead of their memory addresses
    }
}
