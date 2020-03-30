package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtableConcept {
	
	public static void main(String[] args)
	{
		//Hashtable is synchronized unlike hashmap
		//Key-->Object-->Hashcode-->Value
		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
		ht1.put(11, "eleven");
		ht1.put(13,"thirteen");
		
		//printing usinf enumaeration
		Enumeration e = ht1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
		Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();
		ht2.put(100, "hundred");
		ht2.put(130,"one thirty");
		
		//print using entry set
		Set s = ht2.entrySet();
		System.out.println(s);
		
		if(!(ht2.equals(ht1)))
			System.out.println(ht1.hashCode());
		
		System.out.println(ht2.hashCode());

	}		
}