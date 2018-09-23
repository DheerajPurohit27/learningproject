package cognizant;

public class MainMethodOverloading {
	
	public static void main(String[] args) {
		System.out.println("A");
	}
	
	public static void main(String args) {
		System.out.println("B");
	}
	
	public static void main() {
		System.out.println("C");
	}

}

//This will only print A.
//Note: main method can be overloaded, above is the example