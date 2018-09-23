package cognizant;

public class C extends B{
	
	C(){
		System.out.println("C");
	}
	
public static void main(String[] args) {
	B obj=new C();
	
}
}

/* When B obj=new C();
then output will be: A B C
	
but	when B obj=new B();
then output will be: A B    */
	
	