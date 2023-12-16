package Enum;

enum Status {
	Running, Stopped, Pending, Complete;
}

enum Laptop {
    Apple(1000), Dell(800), HP, Lenovo(600), Acer(500);
    
    private int price;
    
    Laptop() {
        price = 0; // For HP
    }

    Laptop(int p) {
        price = p;
    }
    
    int getPrice() {
        return price;
    }
}

class Main {
	public static void main(String[] args) {
		Status s = Status.Running;
		System.out.println(s);
		System.out.println("Index of " + s + ": " + s.ordinal());

		Status[] arr = Status.values();

		for(Status ss: arr) {
			System.out.println(ss + ": " + ss.ordinal());
		}
 
        if(s == Status.Running) {
            System.out.println("Running");
        }

        switch (s) {
            case Running:
                System.out.println("Running");
                break;
            case Stopped:
                System.out.println("Stopped");
                break;
            case Pending:
                System.out.println("Pending");
                break;
            case Complete:
                System.out.println("Complete");
                break;
            default:
                break;
        }

        for(Laptop l: Laptop.values()) {
            System.out.println(l + ": " + l.getPrice());
        }
	}
}
