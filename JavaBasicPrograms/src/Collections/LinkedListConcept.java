package Collections;

import java.util.LinkedList;

public class LinkedListConcept {

	
	//same as arraylist except few operations
	public static void main(String[] args)
	{
		LinkedList l1 = new LinkedList();
		l1.add(14);
		l1.add("raju");
		l1.add("check");
		System.out.println(l1);
		l1.addFirst(1);
		l1.addLast("last");

		//printing using while loop
		int n=0;
		while(l1.size()>n)
		{
			System.out.println(l1.get(n));
			n++;
		}
		l1.removeFirst();
		l1.remove(2);
		System.out.println(l1);
		l1.set(0, "first");
		//replaces first index value with first
		System.out.println(l1);
	}
}
