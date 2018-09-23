package OOPS;

public class ThisKeyword {
	
	int a=10;
	
	public void f1(){
		int a=20;
		
		a=this.a;
		
		System.out.println(a);
	}
	
public static void main(String[] args) {
	
	ThisKeyword obj=new ThisKeyword();
	obj.f1();
	
}
}
