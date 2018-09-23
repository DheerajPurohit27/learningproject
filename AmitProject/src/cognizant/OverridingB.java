package cognizant;

public class OverridingB extends OverridingA{
	
	public void verify(){
		System.out.println("I am in class B");
	}
	
	public void verify2(){
		System.out.println("I am in method verify2 in class B");
	}
	
	public static void main(String[] args) {
		
		OverridingB obj=new OverridingB();
		obj.verify();
		
		
	}

}
