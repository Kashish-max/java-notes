package Final_Keyword;

final class FinalClass {
    public void display() {
        System.out.println("Final class");
    }
}

// error: cannot inherit from final FinalClass
// class SubClass extends FinalClass {
//     public void display() {
//         System.out.println("Subclass");
//     }
// }