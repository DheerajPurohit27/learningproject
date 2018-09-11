package constructorchain;

public class Constchain1 extends Constructorchain {

	public Constchain1() {
		super();
		System.out.println("child class const");
		
	}
	Constchain1(int a)
	{
		super(10);
		System.out.println("print chal const"+a);
	}

}
