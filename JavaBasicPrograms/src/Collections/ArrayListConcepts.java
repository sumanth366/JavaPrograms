package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {
	
	public static void main(String [] args)
	{
		ArrayList ar = new ArrayList();
		ar.add(25);
		ar.add("Sumanth");
		System.out.println(ar);
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Sumanth");
		ar1.add("sonu");
		ar1.add("ravi");
		
		//printing using iterator
		Iterator<String> it = ar1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Intersection of 2 arraylists
		System.out.println(ar.retainAll(ar1));
		
		ar.addAll(ar1);
		System.out.println(ar);
		
		ar.removeAll(ar1);
		System.out.println(ar);
		
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		Employee e1 = new Employee("Sumanth", 25, "male");
		Employee e2 = new Employee("Ravi", 25, "male");
		emp.add(e1);
		emp.add(e2);
		
		//printing using for each loop
		for(Employee e : emp)
		{
			System.out.println(e.name+" "+e.age+" "+e.gender);
		}
	}

}
