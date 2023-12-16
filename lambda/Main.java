package lambda;

// Functional Interface is an interface with only one abstract method.
@FunctionalInterface
interface A {
	void show(int i);
}

// Lambda expression can only be used with functional interface.
// Lambda expression is used to reduce the code.
// Lambda expression removes need of new keyword, method name, return type of parameter list.

class Main {
	public static void main(String... args) {
		A obj = new A() {
			public void show(int i) {
				System.out.println("In show");
			}
		};

        // we can use lambda expression to reduce the code.
		A obj2 = (i) -> {
            System.out.println("In show " + i);
		};

        obj2.show(4);
	}
}