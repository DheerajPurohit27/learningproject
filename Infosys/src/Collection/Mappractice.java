package Collection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Permission;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Treadclass extends Thread
{
	synchronized public void run()
	{
		System.out.println("start");
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException ie)
		{}
			System.out.println("END");
		
	}
}

public class Mappractice {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Treadclass().start();
		new Treadclass().start();
	}

}
