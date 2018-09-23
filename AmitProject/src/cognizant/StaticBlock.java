package cognizant;

public class StaticBlock {
	
	public static void main(String[] args) {
		
		StaticBlock obj=new StaticBlock();
		
	}
	StaticBlock(){
		System.out.println("I am in constructor");
	}
	
	static{
		System.out.println("I am in static block");
	}
	

}
