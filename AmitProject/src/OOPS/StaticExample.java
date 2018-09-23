package OOPS;

public class StaticExample {
int a=10;
	
	public static void f1(){
		int a=20;
		
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		StaticExample.f1();
		
	}
}
