package Exceptionhandling;

public class Throws {

	void test2()throws Exception
	{
		int a[]={1,2,3,4,5};
			System.out.println(a[5]);
}	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Throws  obj=new Throws();
		try {
			obj.test2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
