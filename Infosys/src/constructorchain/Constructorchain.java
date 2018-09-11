package constructorchain;

public class Constructorchain {

public Constructorchain() {
	// TODO Auto-genera'ted constructor stub
	System.out.println("Super class const");
}
Constructorchain(int a)
{
	this();
	System.out.println("super class"+ a);

	}

Constructorchain(double b)
{
	this(10);
	System.out.println("print value of" + b);
	
}
public static void main(String[] args)
{
	Constructorchain rv=new Constructorchain(10.4);
}
}
