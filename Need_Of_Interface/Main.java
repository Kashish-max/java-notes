package Need_Of_Interface;

class Computer {
	void code() {}
}

// abstract Computer {
// 	abstract void code();
// }

// interface Computer {
// 	void code();
// }

class Laptop extends Computer {
	void code() {
		System.out.println("Coding from Laptop");
	}
}

class Desktop extends Computer {
	void code() {
		System.out.println("Coding from Desktop");
	}
}

class Developer {
	void devApp(Computer computer) {
		computer.code();
	}
}

// The Developer class is not dependent on the Laptop or Desktop class.
// It is dependent on the Computer class.
// So if we want to add a new class, say Tablet, we can do so without changing the Developer class.
class Main {
	public static void main(String... args) {
		Computer laptop = new Laptop();
		Computer desktop = new Desktop();

		Developer sde = new Developer();
		Developer devops = new Developer();

		sde.devApp(laptop);
		devops.devApp(desktop);
	}
}