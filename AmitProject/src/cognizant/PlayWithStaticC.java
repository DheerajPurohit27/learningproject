package cognizant;

public class PlayWithStaticC extends PlayWithStaticB{
	
	public static void verify3(){
		System.out.println("I am in Class C");
	}

	public static void main(String[] args) {
		
		
	}

}

//Note: There will nothing printed on console as methods are not being called.
// Since methods are static hence, they can be called className followed by dot operator followed by method name. No need of creating object of the class
//Example: PlayWithStaticC.verify1(); PlayWithStaticC.verify2(); PlayWithStaticC.verify3();