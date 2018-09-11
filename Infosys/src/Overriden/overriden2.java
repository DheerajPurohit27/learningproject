package Overriden;

public class overriden2 extends overriden1 implements Overriden3 {
	public void testB(){
		System.out.println("interface method B ");
		
	}
	public void testC(){
		System.out.println("interface method C");
	}
	void testA() 
	{
		System.out.println("abstract class");
	}
	public void test1()
	{
		
		System.out.println("1st Sub class method");
		super.test1();
	}
	public void test2()
	{
		super.test2();
		System.out.println("2nd sub class method");
	}
}

