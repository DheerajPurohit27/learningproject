package OOPS;

public class MethodOverriding2 extends MethodOverriding{
	
	public void f1(){
		
		System.out.println("b");
	}
	
	public static void main(String[] args) {
		
		MethodOverriding2 obj=new MethodOverriding2();
		obj.f1();
		
		
	}

}
