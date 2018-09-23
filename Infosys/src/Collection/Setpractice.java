package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setpractice {
void test(){
	Set<String> set1= new TreeSet<>();
	set1.add("hello");
	set1.add("bye");
	set1.add("dheeraj");
	set1.add("bye");
	System.out.println(set1);
	
	for(String str:set1)
	{
		System.out.println(str);
	}
	Iterator<String> ite= set1.iterator();
	while(ite.hasNext())
	{
		System.out.println(ite.next());
	}
}
	public static void main(String args[])
	{
		Setpractice obj=new Setpractice();
		obj.test();
	}
}
