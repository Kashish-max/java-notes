package this_Keyword;

// this keyword is used to refer to the current instance inside a method or constructor

class ThisKeywordClass {
    int a;
    int b;

    // this keyword can be used for constructor chaining
    // Note: There should not be recursive calls that will lead to infinite loop
    ThisKeywordClass(int a) {
        this(a, 0);
    }
    
    // this keyword can eliminate the confusion between class attributes and parameters with same name
    ThisKeywordClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a = " + a + ", b = " + b);
    }
}

public class Main {
    public static void main(String[] args) {
        ThisKeywordClass obj = new ThisKeywordClass(3, 4);
        obj.display();

        ThisKeywordClass obj2 = new ThisKeywordClass(6);
        obj2.display();
    }
}
