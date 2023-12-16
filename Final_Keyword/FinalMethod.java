package Final_Keyword;

public class FinalMethod {
    public final void display() {
        System.out.println("Final method");
    }
}

// error: display() in SubClass cannot override display() in FinalMethod
// class SubClass extends FinalMethod {
//     public void display() {
//         System.out.println("Subclass");
//     }
// }