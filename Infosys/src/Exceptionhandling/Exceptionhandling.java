package Exceptionhandling;

import net.bytebuddy.implementation.bytecode.Throw;

public class Exceptionhandling {
	//Exception e=new Exception();
	//throw e;
	void test(int a,int b)
	{
		try{
		if(b==0)
			
			throw new Exception("Zero division exception");
			int c=a/b;
		}
		catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exceptionhandling obj=new Exceptionhandling();
		obj.test(5, 0);

	}

}
