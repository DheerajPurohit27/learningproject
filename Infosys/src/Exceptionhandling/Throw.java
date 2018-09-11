package Exceptionhandling;

public class Throw {

	void test(int a,int b)
	{ 
		try{
		if(b==0)
			throw new Exception("division by zero is not allowed");
			int c=a/b;
	}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Throw obj=new Throw();
			obj.test(10, 0);

	}

}
