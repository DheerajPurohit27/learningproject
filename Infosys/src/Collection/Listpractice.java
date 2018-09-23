package Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Listpractice {
		void list()
		{
			List<String> lst=new LinkedList<>();
			lst.add("hello");
			lst.add("bye");
			lst.add("seeyou");
			System.out.println(lst);
			System.out.println(lst.contains("bye"));
			System.out.println(lst.size());
			System.out.println(lst.remove(2));
			for(String lst1:lst)
			{
				System.out.println(lst1);
			}
			ListIterator<String> ite=lst.listIterator();
				while(ite.hasNext())
				{
					System.out.println(ite.next());
				
			}
			
				while(ite.hasPrevious())
				{
					System.out.println(ite.previous());
				}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Listpractice obj=new Listpractice();
			obj.list();

		}

	}

